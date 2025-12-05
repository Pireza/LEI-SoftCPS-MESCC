#include <WiFi.h>
#include <PubSubClient.h>
#include <WiFiClientSecure.h>
//---- WiFi settings
const char* ssid = "iPhone Luis";
const char* password = "";
//---- MQTT Broker settings
const char* mqtt_server = "2b3715318c674bfbb3ac5bbda2269d25.s1.eu.hivemq.cloud"; 
const char* mqtt_username = "arduino";                      
const char* mqtt_password = "Arduino1";                                
const int mqtt_port = 8883;
WiFiClientSecure espClient;
PubSubClient client(espClient);
unsigned long lastMsg = 0;
#define MSG_BUFFER_SIZE (50)
char msg[MSG_BUFFER_SIZE];
char data[100];
int value = 0;
void setup() {
  delay(5000);
  Serial.begin(9600);
  Serial.print("\nConnecting to ");
  Serial.println(ssid);
  WiFi.mode(WIFI_STA);
  WiFi.begin(ssid, password);
  while (WiFi.status() != WL_CONNECTED) {
    delay(500);
    Serial.print(".");
  }
  randomSeed(micros());
  Serial.println("\nWiFi connected\nIP address: ");
  Serial.println(WiFi.localIP());
  while (!Serial) delay(1);
  espClient.setInsecure(); 
  client.setServer(mqtt_server, mqtt_port);
  client.setCallback(callback);
}
void loop() {
  if (!client.connected())
    reconnect();
  client.loop();
  value++;
  sprintf(data, "%d", value);
  Serial.println(data);
  publishMessage("/comcs/counter", String(data), true);
  delay(5000);
}
void reconnect() {
  // Loop until we’re reconnected
  while (!client.connected()) {
    Serial.print("Attempting MQTT connection…");
    String clientId = "ESP32-";
    clientId += String(random(0xffff), HEX);
    // Attempt to connect
    if (client.connect(clientId.c_str(), mqtt_username, mqtt_password)) {
      Serial.println("connected");
      client.subscribe("/comcs/commands"); 
    } else {
      Serial.print("failed, rc=");
      Serial.print(client.state());
      Serial.println(" try again in 5 seconds");  // Wait 5 seconds before retrying
      delay(5000);
    }
  }
}
//=======================================
// This void is called every time we have a message from the broker
void callback(char* topic, byte* payload, unsigned int length) {
  Serial.print("Callback - ");
  Serial.print("Message:");
  for (int i = 0; i < length; i++) {
    Serial.print((char)payload[i]);
  }
  Serial.println("");
}
//======================================= publising as string
void publishMessage(const char* topic, String payload, boolean retained) {
  if (client.publish(topic, payload.c_str(), true))
    Serial.println("Message published [" + String(topic) + "]: " + payload);
}
