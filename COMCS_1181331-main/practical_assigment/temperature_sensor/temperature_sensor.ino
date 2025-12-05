#include "DHT.h"
#include <WiFi.h>
#include <WiFiUdp.h>
#include <PubSubClient.h>
#include <WiFiClientSecure.h>
#include <time.h>
#include <string.h>
#include <ArduinoJson.h>

// --- SPIFFS for rolling window ---
#include "FS.h"
#include "SPIFFS.h"

//==== WiFi settings
const char* ssid = "";
const char* password = "";

//==== NTP settings
const char* ntpServer = "pool.ntp.org";
const long gmtOffset_sec = 0;
const int daylightOffset_sec = 3600;

//==== MQTT settings
const char* mqtt_server = "2b3715318c674bfbb3ac5bbda2269d25.s1.eu.hivemq.cloud";
const int mqtt_port = 8883;
const char* mqtt_username = "hivemq.webclient.1761935981787";
const char* mqtt_password = "W0@n4o.H3dTqC>jwM:B8";
//const char* mqtt_password = "W0@n4o.H3d";

//==== UDP alert server
const char* udpAddress = "192.168.1.193";
const int udpPort = 8080;
const int qos_udp = 1;
const int timeout = 500; // in milliseconds

WiFiClientSecure espClient;
PubSubClient client(espClient);
WiFiUDP udp;

#define DHTTYPE DHT11
DHT dht(21, DHTTYPE);

String esp_id = "ESP_TRH01";

static const char* root_ca PROGMEM = R"EOF(
-----BEGIN CERTIFICATE-----
MIIFazCCA1OgAwIBAgIRAIIQz7DSQONZRGPgu2OCiwAwDQYJKoZIhvcNAQELBQAw
TzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh
cmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMTUwNjA0MTEwNDM4
WhcNMzUwNjA0MTEwNDM4WjBPMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJu
ZXQgU2VjdXJpdHkgUmVzZWFyY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBY
MTCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBAK3oJHP0FDfzm54rVygc
h77ct984kIxuPOZXoHj3dcKi/vVqbvYATyjb3miGbESTtrFj/RQSa78f0uoxmyF+
0TM8ukj13Xnfs7j/EvEhmkvBioZxaUpmZmyPfjxwv60pIgbz5MDmgK7iS4+3mX6U
A5/TR5d8mUgjU+g4rk8Kb4Mu0UlXjIB0ttov0DiNewNwIRt18jA8+o+u3dpjq+sW
T8KOEUt+zwvo/7V3LvSye0rgTBIlDHCNAymg4VMk7BPZ7hm/ELNKjD+Jo2FR3qyH
B5T0Y3HsLuJvW5iB4YlcNHlsdu87kGJ55tukmi8mxdAQ4Q7e2RCOFvu396j3x+UC
B5iPNgiV5+I3lg02dZ77DnKxHZu8A/lJBdiB3QW0KtZB6awBdpUKD9jf1b0SHzUv
KBds0pjBqAlkd25HN7rOrFleaJ1/ctaJxQZBKT5ZPt0m9STJEadao0xAH0ahmbWn
OlFuhjuefXKnEgV4We0+UXgVCwOPjdAvBbI+e0ocS3MFEvzG6uBQE3xDk3SzynTn
jh8BCNAw1FtxNrQHusEwMFxIt4I7mKZ9YIqioymCzLq9gwQbooMDQaHWBfEbwrbw
qHyGO0aoSCqI3Haadr8faqU9GY/rOPNk3sgrDQoo//fb4hVC1CLQJ13hef4Y53CI
rU7m2Ys6xt0nUW7/vGT1M0NPAgMBAAGjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNV
HRMBAf8EBTADAQH/MB0GA1UdDgQWBBR5tFnme7bl5AFzgAiIyBpY9umbbjANBgkq
hkiG9w0BAQsFAAOCAgEAVR9YqbyyqFDQDLHYGmkgJykIrGF1XIpu+ILlaS/V9lZL
ubhzEFnTIZd+50xx+7LSYK05qAvqFyFWhfFQDlnrzuBZ6brJFe+GnY+EgPbk6ZGQ
3BebYhtF8GaV0nxvwuo77x/Py9auJ/GpsMiu/X1+mvoiBOv/2X/qkSsisRcOj/KK
NFtY2PwByVS5uCbMiogziUwthDyC3+6WVwW6LLv3xLfHTjuCvjHIInNzktHCgKQ5
ORAzI4JMPJ+GslWYHb4phowim57iaztXOoJwTdwJx4nLCgdNbOhdjsnvzqvHu7Ur
TkXWStAmzOVyyghqpZXjFaH3pO3JLF+l+/+sKAIuvtd7u+Nxe5AW0wdeRlN8NwdC
jNPElpzVmbUq4JUagEiuTDkHzsxHpFKVK7q4+63SM1N95R1NbdWhscdCb+ZAJzVc
oyi3B43njTOQ5yOf+1CceWxG1bQVs5ZufpsMljq4Ui0/1lvh+wjChP4kqKOJ2qxq
4RgqsahDYVvTH9w7jXbyLeiNdd8XM2w9U/t7y0Ff/9yi0GE44Za4rF2LN9d11TPA
mRGunUHBcnWEvgJBQl9nJEiU0Zsnvgc/ubhPgXRR4Xq37Z0j4r7g1SgEEzwxA57d
emyPxgcYxn/eR44/KJ4EBs+lVDR3veyJm+kXQ99b21/+jh5Xos1AnX5iItreGCc=
-----END CERTIFICATE-----
)EOF";

//================ ROLLING WINDOW DEFINITIONS ================

// last 100 samples
const int TELEMETRY_LOG_SIZE = 100;
const char* TELEMETRY_FILENAME = "/telemetry.bin";

struct TelemetryLogEntry {
  uint8_t valid;          // 0 = empty; 1 = stored & not yet successfully resent
  uint32_t timestamp_ms;  // millis() when sampled
  float temperature;
  float humidity;
  char id[96];
  char dateObserved[40];
};

int telemetryLogIndex = 0;

// forward decls
void reconnect();
bool publishMessageBool(const char* topic, const String& payload, bool retained);
bool sendUDP(const String& payload);
void build_payload(DynamicJsonDocument& doc, TelemetryLogEntry* out);
void replayStoredTelemetry();

//---------------- SPIFFS debug (optional) ----------------
void printSPIFFSInfo() {
  Serial.printf("[SPIFFS] total=%u used=%u\n",
                (unsigned)SPIFFS.totalBytes(),
                (unsigned)SPIFFS.usedBytes());
}

//---------------- Rolling file helpers ----------------

void telemetryLogInit() {
  TelemetryLogEntry empty = {};
  empty.valid = 0;

  if (!SPIFFS.exists(TELEMETRY_FILENAME)) {
    Serial.println("[ROLLING] Creating telemetry file (fixed size)");
    File file = SPIFFS.open(TELEMETRY_FILENAME, FILE_WRITE);
    if (!file) {
      Serial.println("[ROLLING] Failed to create telemetry file");
      return;
    }

    for (int i = 0; i < TELEMETRY_LOG_SIZE; ++i) {
      file.write((const uint8_t*)&empty, sizeof(TelemetryLogEntry));
    }
    file.close();
  } else {
    Serial.println("[ROLLING] Telemetry file already exists (keeping previous data)");
  }

  File check = SPIFFS.open(TELEMETRY_FILENAME, FILE_READ);
  if (check) {
    Serial.printf("[ROLLING] telemetry file size=%u expected=%u\n",
                  (unsigned)check.size(),
                  (unsigned)(TELEMETRY_LOG_SIZE * sizeof(TelemetryLogEntry)));
    check.close();
  }

  telemetryLogIndex = 0;
}

// open in read+write without truncation: mode "r+"
void writeTelemetryEntry(int index, const TelemetryLogEntry& entry) {
  File file = SPIFFS.open(TELEMETRY_FILENAME, "r+");
  if (!file) {
    Serial.println("[ROLLING] Failed to open telemetry file for writing (r+)");
    printSPIFFSInfo();
    return;
  }

  size_t offset = index * sizeof(TelemetryLogEntry);
  if (!file.seek(offset)) {
    Serial.printf("[ROLLING] Seek failed in write at index %d (offset %u, fileSize=%u)\n",
                  index, (unsigned)offset, (unsigned)file.size());
    file.close();
    return;
  }

  size_t written = file.write((const uint8_t*)&entry, sizeof(TelemetryLogEntry));
  if (written != sizeof(TelemetryLogEntry)) {
    Serial.printf("[ROLLING] Incomplete write: wrote %u of %u\n",
                  (unsigned)written,
                  (unsigned)sizeof(TelemetryLogEntry));
  }
  file.close();
}

bool readTelemetryEntry(int index, TelemetryLogEntry& entry) {
  File file = SPIFFS.open(TELEMETRY_FILENAME, FILE_READ);
  if (!file) {
    Serial.println("[ROLLING] Failed to open telemetry file for reading");
    printSPIFFSInfo();
    return false;
  }

  size_t fileSize = file.size();
  size_t offset = index * sizeof(TelemetryLogEntry);
  if (offset + sizeof(TelemetryLogEntry) > fileSize) {
    Serial.printf("[ROLLING] read: index %d beyond end (offset=%u entrySize=%u fileSize=%u)\n",
                  index, (unsigned)offset,
                  (unsigned)sizeof(TelemetryLogEntry),
                  (unsigned)fileSize);
    file.close();
    return false;
  }

  if (!file.seek(offset)) {
    Serial.printf("[ROLLING] Seek failed on read at index %d (offset %u, fileSize=%u)\n",
                  index, (unsigned)offset, (unsigned)fileSize);
    file.close();
    return false;
  }

  size_t n = file.read((uint8_t*)&entry, sizeof(TelemetryLogEntry));
  file.close();
  if (n != sizeof(TelemetryLogEntry)) {
    Serial.printf("[ROLLING] Incomplete read: read %u of %u\n",
                  (unsigned)n, (unsigned)sizeof(TelemetryLogEntry));
    return false;
  }
  return true;
}

void telemetryLogAppend(const TelemetryLogEntry& sample) {
  TelemetryLogEntry entry = sample;
  entry.valid = 1;

  Serial.printf("[ROLLING] Storing sample at index %d (temp=%.2f, hum=%.2f)\n",
                telemetryLogIndex, entry.temperature, entry.humidity);

  writeTelemetryEntry(telemetryLogIndex, entry);
  telemetryLogIndex = (telemetryLogIndex + 1) % TELEMETRY_LOG_SIZE;
}

void telemetryLogClear(int index) {
  TelemetryLogEntry empty = {};
  empty.valid = 0;
  writeTelemetryEntry(index, empty);
}

//================ SETUP / LOOP ================

unsigned long lastReplayMs = 0;
const unsigned long REPLAY_PERIOD = 10000;  // 10s

void callback(char* topic, byte* payload, unsigned int length) {
  Serial.print("Callback - ");
  Serial.print("Message:");
  for (unsigned int i = 0; i < length; i++) {
    Serial.print((char)payload[i]);
  }
  Serial.println();
}

void setup() {
  delay(5000);
  Serial.begin(9600);

  // SPIFFS init
  Serial.println("Mounting SPIFFS...");
  if (!SPIFFS.begin(true)) {
    Serial.println("Failed to mount SPIFFS");
  } else {
    Serial.println("SPIFFS mounted successfully");
    printSPIFFSInfo();
    telemetryLogInit();
  }

  // WiFi + time
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

  configTime(gmtOffset_sec, daylightOffset_sec, ntpServer);

  // Sensor
  dht.begin();
  Serial.println("\nDHT began: ");
  while (!Serial) delay(1);

  // MQTT
  espClient.setCACert(root_ca);
  client.setServer(mqtt_server, mqtt_port);
  client.setCallback(callback);

  // First connection will be handled in loop() by reconnect()
}

void loop() {
  // MQTT connection management (non-blocking retry)
  if (!client.connected()) {
    reconnect();
  } else {
    client.loop();
  }

  // Build and send current sample
  DynamicJsonDocument doc(512);
  TelemetryLogEntry sample = {};
  build_payload(doc, &sample);

  String json;
  serializeJson(doc, json);
  Serial.println(json);

  bool mqtt_ok = false;
  if (client.connected()) {
    mqtt_ok = publishMessageBool("comcs/sensor", json, true);
  } else {
    Serial.println("[ROLLING] MQTT not connected, cannot publish");
  }

  bool udp_ok = sendUDP(json);

  // if either channel fails, store sample in SPIFFS
  if (!mqtt_ok || !udp_ok) {
    Serial.println("[ROLLING] Communication error, logging sample to SPIFFS");
    if (SPIFFS.totalBytes() > 0) {
      telemetryLogAppend(sample);
    } else {
      Serial.println("[ROLLING] SPIFFS not available, cannot log");
    }
  }

  // Periodically try to replay stored telemetry
  unsigned long now = millis();
  if (now - lastReplayMs > REPLAY_PERIOD) {
    lastReplayMs = now;
    replayStoredTelemetry();
  }

  delay(1000);
}

//================ PAYLOAD (SmartData) ================

void build_payload(DynamicJsonDocument& payload, TelemetryLogEntry* out_entry) {
  String payload_id = String("WeatherObserved:") + esp_id + String(":");

  struct tm timeinfo;
  char retrieved_date[255] = "Date could not be retrieved";
  if (getLocalTime(&timeinfo)) {
    snprintf(retrieved_date, sizeof(retrieved_date),
             "%04d-%02d-%02dT%02d:%02d:%02d.00Z",
             timeinfo.tm_year + 1900,
             timeinfo.tm_mon + 1,
             timeinfo.tm_mday,
             timeinfo.tm_hour,
             timeinfo.tm_min,
             timeinfo.tm_sec);
  }

  payload_id += String(retrieved_date);
  payload["id"] = payload_id.c_str();
  payload["dateObserved"] = retrieved_date;

  JsonObject location = payload.createNestedObject("location");
  location["type"] = "Point";
  JsonArray coords = location.createNestedArray("coordinates");
  coords.add(-8.60622);
  coords.add(41.17878);

  payload["type"] = "WeatherObserved";

  float temp = dht.readTemperature();
  float hum = dht.readHumidity();

  payload["temperature"] = String(temp);
  payload["relativeHumidity"] = String(hum);

  if (out_entry) {
    out_entry->timestamp_ms = millis();
    out_entry->temperature = temp;
    out_entry->humidity = hum;
    strncpy(out_entry->id, payload_id.c_str(), sizeof(out_entry->id) - 1);
    out_entry->id[sizeof(out_entry->id) - 1] = '\0';

    strncpy(out_entry->dateObserved, retrieved_date,
            sizeof(out_entry->dateObserved) - 1);
    out_entry->dateObserved[sizeof(out_entry->dateObserved) - 1] = '\0';
  }
}

//================ MQTT / UDP HELPERS ================

// Non-blocking reconnect: tries every 5 seconds, returns immediately
void reconnect() {
  static unsigned long lastAttempt = 0;
  const unsigned long RETRY_INTERVAL = 5000;

  unsigned long now = millis();
  if (now - lastAttempt < RETRY_INTERVAL) {
    return;
  }
  lastAttempt = now;

  Serial.print("Attempting MQTT connection…");
  String clientId = "ESP32-";
  clientId += String(random(0xffff), HEX);

  if (client.connect(clientId.c_str(), mqtt_username, mqtt_password)) {
    Serial.println("connected");
  } else {
    Serial.print("failed, rc=");
    Serial.print(client.state());
    Serial.println(" (will retry later)");
  }
}

bool publishMessageBool(const char* topic, const String& payload, bool retained) {
  bool ok = client.publish(topic, payload.c_str(), retained);
  if (ok) {
    Serial.println("Message published [" + String(topic) + "]: " + payload);
  } else {
    Serial.println("MQTT publish failed for topic [" + String(topic) + "]");
  }
  return ok;
}

void publishMessage(const char* topic, String payload, boolean retained) {
  publishMessageBool(topic, payload, retained);
}

bool sendUDP(const String& payload) {
  if (udp.beginPacket(udpAddress, udpPort) != 1) {
    Serial.println("UDP beginPacket failed");
    return false;
  }
  udp.write((const uint8_t*)payload.c_str(), payload.length());
  int rc = udp.endPacket();
  if (rc != 1) {
    Serial.println("UDP endPacket failed");
    return false;
  }

  if (qos_udp == 1) {
    char udp_ack[20];
    memset(udp_ack, 0, sizeof(udp_ack));
    unsigned long startTime = millis();

    while (millis() - startTime < timeout) {

      int packetSize = udp.parsePacket();
      if (packetSize > 0) {

        int len = udp.read(udp_ack, sizeof(udp_ack) - 1);
        if (len > 0) udp_ack[len] = '\0';

        if (strcmp(udp_ack, "UDP Received") == 0) {

          Serial.print("Received ACK - ");
          Serial.println(udp_ack);

          return true;
        }
      }
    }

    Serial.println("Did not get ACK.\nRe-sending message...");
    udp.beginPacket(udpAddress, udpPort);
    udp.write((const uint8_t*)payload.c_str(), payload.length());
    udp.endPacket();
  }

  return true;
}

//================ REPLAY LOGIC (rolling window QoS) ================

void replayStoredTelemetry() {
  if (WiFi.status() != WL_CONNECTED) {
    Serial.println("[ROLLING] WiFi not connected, cannot replay");
    return;
  }
  if (!client.connected()) {
    Serial.println("[ROLLING] MQTT not connected, cannot replay");
    return;
  }
  if (!SPIFFS.exists(TELEMETRY_FILENAME)) {
    return;
  }

  Serial.println("[ROLLING] Attempting to replay stored telemetry...");

  for (int i = 0; i < TELEMETRY_LOG_SIZE; ++i) {
    TelemetryLogEntry entry;
    if (!readTelemetryEntry(i, entry)) {
      continue;
    }
    if (entry.valid != 1) {
      continue;
    }

    DynamicJsonDocument payload(512);
    payload["id"] = entry.id;
    payload["dateObserved"] = entry.dateObserved;

    JsonObject location = payload.createNestedObject("location");
    location["type"] = "Point";
    JsonArray coords = location.createNestedArray("coordinates");
    coords.add(-8.60622);
    coords.add(41.17878);

    payload["type"] = "WeatherObserved";
    payload["temperature"] = String(entry.temperature);
    payload["relativeHumidity"] = String(entry.humidity);

    String json;
    serializeJson(payload, json);

    Serial.printf("[ROLLING] Replaying index %d → %s\n", i, json.c_str());

    bool mqtt_ok = publishMessageBool("comcs/sensor", json.c_str(), true);
    bool udp_ok = sendUDP(json.c_str());

    if (mqtt_ok && udp_ok) {
      telemetryLogClear(i);
      Serial.printf("[ROLLING] Successfully resent and cleared index %d\n", i);
    } else {
      Serial.printf("[ROLLING] Failed to resend index %d (will retry later)\n", i);
    }
  }
}
