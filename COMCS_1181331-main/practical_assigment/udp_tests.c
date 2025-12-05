#include <arpa/inet.h>
#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#include <unistd.h>

#define DEFAULT_PORT 8080
#define DEFAULT_HOST "192.168.64.2"

struct client_args {
  char host[128];
  int port;
  int messages;
  int id;
};

void *client_thread(void *arg) {
  struct client_args *cfg = (struct client_args *)arg;
  srand(time(NULL) ^ (cfg->id << 16));

  int sockfd = socket(AF_INET, SOCK_DGRAM, 0);
  if (sockfd < 0) {
    perror("socket");
    free(cfg);
    return NULL;
  }

  struct timeval tv;
  tv.tv_sec = 1;
  tv.tv_usec = 0;
  setsockopt(sockfd, SOL_SOCKET, SO_RCVTIMEO, &tv, sizeof(tv));

  struct sockaddr_in serv;
  memset(&serv, 0, sizeof(serv));
  serv.sin_family = AF_INET;
  serv.sin_port = htons(cfg->port);
  inet_pton(AF_INET, cfg->host, &serv.sin_addr);

  char buffer[256];
  char recvbuf[256];

  for (int i = 0; i < cfg->messages; i++) {
    float humidity = 65.0f + ((rand() % 100) / 100.0f - 0.5f);
    float temperature = 20.0f + ((rand() % 100) / 100.0f - 0.5f);

    // min and max alert
    if (i == 0)
      humidity = 10.0f;
    if (i == 1)
      temperature = -5.0f;
    // diff alert
    if (i == 2)
      humidity = 50.0f;
    if (i == 3)
      temperature = 10.0f;

    snprintf(buffer, sizeof(buffer),
             "{\"relativeHumidity\":\"%.2f\",\"temperature\":\"%.2f\"}",
             humidity, temperature);

    int r = sendto(sockfd, buffer, strlen(buffer), 0, (struct sockaddr *)&serv,
                   sizeof(serv));

    if (r < 0) {
      perror("sendto");
    } else {
      printf("[Client %d] Sent %d: %s\n", cfg->id, i + 1, buffer);
    }

    socklen_t slen = sizeof(serv);
    int n = recvfrom(sockfd, recvbuf, sizeof(recvbuf) - 1, 0,
                     (struct sockaddr *)&serv, &slen);

    if (n < 0) {
      printf("[Client %d] ERROR: No response received (timeout)\n", cfg->id);
    } else {
      recvbuf[n] = '\0';
      printf("[Client %d] Received: %s\n", cfg->id, recvbuf);

      if (strstr(recvbuf, "UDP Received") == NULL) {
        printf("[Client %d] ERROR: Expected 'UDP Received' but got something "
               "else.\n",
               cfg->id);
      } else {
        printf("[Client %d] OK: Server acknowledged UDP packet.\n", cfg->id);
      }
    }

    usleep(1000);
  }

  close(sockfd);
  free(cfg);
  return NULL;
}

int main(int argc, char *argv[]) {
  if (argc < 3) {
    printf("Usage: %s <num_clients> <messages_per_client> [host] [port]\n",
           argv[0]);
    return 1;
  }

  int client_count = atoi(argv[1]);
  int messages = atoi(argv[2]);
  char *host = (argc >= 4) ? argv[3] : (char *)DEFAULT_HOST;
  int port = (argc >= 5) ? atoi(argv[4]) : DEFAULT_PORT;

  printf("Starting load test: %d clients × %d messages\n", client_count,
         messages);
  printf("Target: %s:%d\n", host, port);

  pthread_t threads[client_count];

  for (int i = 0; i < client_count; i++) {
    struct client_args *cfg = malloc(sizeof(struct client_args));
    strncpy(cfg->host, host, sizeof(cfg->host));
    cfg->port = port;
    cfg->messages = messages;
    cfg->id = i + 1;

    pthread_create(&threads[i], NULL, client_thread, cfg);
  }

  for (int i = 0; i < client_count; i++) {
    pthread_join(threads[i], NULL);
  }

  printf("Load test complete.\n");
  return 0;
}
