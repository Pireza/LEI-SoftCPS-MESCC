#include "MQTTClient.h"
#include <arpa/inet.h>
#include <cjson/cJSON.h>
#include <math.h>
#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <unistd.h>

#define PORT 8080
#define BUF_SIZE 1024

MQTTClient client;
MQTTClient_connectOptions conn_opts = MQTTClient_connectOptions_initializer;
MQTTClient_SSLOptions ssl_opts = MQTTClient_SSLOptions_initializer;

// average
struct avg_state {
  float avg;
  unsigned long count;
  pthread_mutex_t lock;
};

void avg_init(struct avg_state *st) {
  st->avg = 0.0;
  st->count = 0;
  pthread_mutex_init(&st->lock, NULL);
}

void avg_add(struct avg_state *st, float x) {
  pthread_mutex_lock(&st->lock);

  st->count++;
  st->avg += (x - st->avg) / st->count;

  pthread_mutex_unlock(&st->lock);
}

float diff(struct avg_state *st, float x) {
  pthread_mutex_lock(&st->lock);
  float diff = fabs(st->avg - x);
  pthread_mutex_unlock(&st->lock);
  return diff;
}

float avg_get(struct avg_state *st) {
  pthread_mutex_lock(&st->lock);
  float value = st->avg;
  pthread_mutex_unlock(&st->lock);
  return value;
}
// average

// MQTT
int mqtt_init() {
  char *url = "ssl://2b3715318c674bfbb3ac5bbda2269d25.s1.eu.hivemq.cloud:8883";
  char *clientid = "udp_server";
  int max_retries = 10;

  int rc = MQTTClient_create(&client, url, clientid,
                             MQTTCLIENT_PERSISTENCE_NONE, NULL);
  if (rc != MQTTCLIENT_SUCCESS) {
    printf("MQTT init failed: %s (code %d)\n", MQTTClient_strerror(rc), rc);
    exit(EXIT_FAILURE);
  }

  // retry
  while ((rc = MQTTClient_connect(client, &conn_opts)) != MQTTCLIENT_SUCCESS) {
    printf("MQTT connect failed: %s (code %d)\n Retrying...\n",
           MQTTClient_strerror(rc), rc);
    sleep(2);
    max_retries--;
    if (max_retries == 0) {
      printf("Max retries reached, check network\n");
      exit(EXIT_FAILURE);
    }
  }
  printf("Connected to MQTT\n");
}

void reconnect() {
  while (!MQTTClient_isConnected(client)) {
    printf("Disconnected from broker.Reconnecting...\n");
    if (MQTTClient_connect(client, &conn_opts) != MQTTCLIENT_SUCCESS) {
      printf("Reconnection failed\n");
      sleep(2);
    } else {
      printf("Reconnected successfully\n");
    }
  }
}

int send_message(char *payload, char *topic) {
  int retries = 3;
  MQTTClient_message message = MQTTClient_message_initializer;
  message.payloadlen = strlen(payload);
  message.payload = payload;
  message.qos = 2;
  int retained = 0;
  MQTTClient_deliveryToken token;

  while (retries != 0) {
    reconnect(); // check if connected, if not try reconnecting
    int rc = MQTTClient_publishMessage(client, topic, &message, &token);

    if (rc != MQTTCLIENT_SUCCESS) {
      printf("MQTT publish failed: %s (code %d)\n", MQTTClient_strerror(rc),
             rc);
      retries--;
    } else {
      printf("Message published successfully to topic: %s\n", topic);
      MQTTClient_waitForCompletion(client, token, 1000L);
      retries = 0;
    }
  }
}
// MQTT

// JSON

float get_value(char *json_string, char *value) {
  float res = 0;

  cJSON *json = cJSON_Parse(json_string);
  if (json == NULL) {
    const char *error_ptr = cJSON_GetErrorPtr();
    if (error_ptr != NULL) {
      printf("Error: %s\n", error_ptr);
    }
    cJSON_Delete(json);
    exit(EXIT_FAILURE);
  }

  // TODO read as number
  cJSON *value_read = cJSON_GetObjectItemCaseSensitive(json, value);
  if (cJSON_IsString(value_read) && (value_read->valuestring != NULL)) {
    res = atof(value_read->valuestring);
  }

  cJSON_Delete(json);

  return res;
}

char *create_json(char *property, float value) {
  time_t currentTime;
  time(&currentTime);

  cJSON *json = cJSON_CreateObject();
  cJSON_AddStringToObject(json, "id", "udp-server-alert");
  cJSON_AddStringToObject(json, "type", "WeatherObserved");
  cJSON_AddStringToObject(json, "dateObserved", ctime(&currentTime));
  cJSON_AddNumberToObject(json, property, value);

  char *json_str = cJSON_Print(json);
  cJSON_Delete(json);

  return json_str;
}

// JSON

struct client_task {
  int sockfd;
  struct sockaddr_in client_addr;
  socklen_t addr_len;
  char buffer[BUF_SIZE];
  struct avg_state *temp_avg;
  struct avg_state *hum_avg;
  MQTTClient *mqtt_client;
  MQTTClient_connectOptions *conn_opts;
};

void *handle_client(void *arg) {
  struct client_task *task = (struct client_task *)arg;

  char *received = "UDP Received";
  sendto(task->sockfd, received, strlen(received), 0,
         (struct sockaddr *)&task->client_addr, task->addr_len);

  printf("Received from %s:%d → %s\n", inet_ntoa(task->client_addr.sin_addr),
         ntohs(task->client_addr.sin_port), task->buffer);

  float temp = get_value(task->buffer, "temperature");
  float hum = get_value(task->buffer, "relativeHumidity");

  if (temp <= 0 || temp >= 50.0) {
    printf("temp higher or lower than limits alert\n");
    send_message(create_json("temperature", temp), "comcs/alertLimitTemp");
    free(task);
    return NULL;
  }
  if (hum <= 20.0 || hum >= 80.0) {
    printf("hum higher or lower than limits alert\n");
    send_message(create_json("relativeHumidity", hum), "comcs/alertLimitHum");
    free(task);
    return NULL;
  }

  avg_add(task->temp_avg, temp);
  avg_add(task->hum_avg, hum);

  float temp_diff = diff(task->temp_avg, temp);
  float hum_diff = diff(task->hum_avg, hum);

  if (temp_diff > 2.0) {
    printf("temp diff higher than limit alert\n");
    send_message(create_json("temperature", temp), "comcs/alertDiffTemp");
    free(task);
    return NULL;
  }
  if (hum_diff > 5.0) {
    printf("hum diff higher than limit alert\n");
    send_message(create_json("relativeHumidity", hum), "comcs/alertDiffHum");
    free(task);
    return NULL;
  }

  // sendto(task->sockfd, task->buffer, strlen(task->buffer), 0,
  //        (struct sockaddr *)&task->client_addr, task->addr_len);

  free(task);
  return NULL;
}

int main() {
  int sockfd;
  struct sockaddr_in server_addr, client_addr;
  struct avg_state temp_avg;
  struct avg_state hum_avg;

  conn_opts.keepAliveInterval = 60; // 1min
  conn_opts.cleansession = 1;
  conn_opts.username = "hivemq.webclient.1761935981787";
  conn_opts.password = "W0@n4o.H3dTqC>jwM:B8";

  ssl_opts.trustStore = "certificate.pem";
  ssl_opts.enableServerCertAuth = 1;
  conn_opts.ssl = &ssl_opts;
  mqtt_init();

  if ((sockfd = socket(AF_INET, SOCK_DGRAM, 0)) < 0) {
    perror("socket failed");
    exit(EXIT_FAILURE);
  }

  memset(&server_addr, 0, sizeof(server_addr));
  server_addr.sin_family = AF_INET;
  server_addr.sin_addr.s_addr = INADDR_ANY;
  server_addr.sin_port = htons(PORT);

  if (bind(sockfd, (struct sockaddr *)&server_addr, sizeof(server_addr)) < 0) {
    perror("bind failed");
    exit(EXIT_FAILURE);
  }

  printf("UDP server running on port %d...\n", PORT);

  avg_init(&temp_avg);
  avg_init(&hum_avg);
  while (1) {
    struct client_task *task = malloc(sizeof(struct client_task));
    if (!task) {
      perror("malloc failed");
      continue;
    }

    task->sockfd = sockfd;
    task->addr_len = sizeof(task->client_addr);
    task->temp_avg = &temp_avg;
    task->hum_avg = &hum_avg;

    int n = recvfrom(sockfd, task->buffer, BUF_SIZE - 1, 0,
                     (struct sockaddr *)&task->client_addr, &task->addr_len);

    if (n < 0) {
      perror("recvfrom failed");
      free(task);
      continue;
    }

    task->buffer[n] = '\0';

    pthread_t tid;
    pthread_create(&tid, NULL, handle_client, task);
    pthread_detach(tid);
  }

  MQTTClient_disconnect(client, 1000);
  MQTTClient_destroy(&client);
  printf("Client disconnected and resources released\n");

  close(sockfd);

  return 0;
}
