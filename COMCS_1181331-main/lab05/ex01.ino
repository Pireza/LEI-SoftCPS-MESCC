#include "FS.h"
#include "SPIFFS.h"
#include "Arduino.h"  // for identify the core
const char* filename = "/logfile.bin";
const int LOG_SIZE = 10;
struct LogEntry {
  uint8_t pos;
  uint32_t timestamp;
  uint32_t freeHeap;
  size_t totalSPIFFS;  //It is large enough to represent the maximum possible size of any object that can be allocated on that system
  size_t usedSPIFFS;
  size_t availableSPIFFS;
  uint8_t iCore;
};
LogEntry Log[LOG_SIZE];
int logIndex = 0;
void logAdd() {
  LogEntry entry;
  entry.pos = logIndex;
  entry.timestamp = millis();
  entry.freeHeap = ESP.getFreeHeap();
  entry.totalSPIFFS = SPIFFS.totalBytes();
  entry.usedSPIFFS = SPIFFS.usedBytes();
  entry.availableSPIFFS = entry.totalSPIFFS - entry.usedSPIFFS;
  entry.iCore = xPortGetCoreID();
  Log[logIndex] = entry;
  logIndex = (logIndex + 1) % LOG_SIZE;
}

void logPrint() {
  Serial.println("[System Log]");
  for (int i = 0; i < LOG_SIZE; i++) {
    int idx = (logIndex + i) % LOG_SIZE;
     Serial.print(idx);
    Serial.print("Entry ");
    Serial.print(Log[idx].pos);
    Serial.print(": Time=");
    Serial.print(Log[idx].timestamp);
    Serial.print(" ms, FreeHeap=");
    Serial.print(Log[idx].freeHeap);
    Serial.print(" bytes");
    Serial.print("| SPIFFS Total=");
    Serial.print(Log[idx].totalSPIFFS);
    Serial.print(" bytes, Used=");
    Serial.print(Log[idx].usedSPIFFS);
    Serial.print(" bytes, Available=");
    Serial.print(Log[idx].availableSPIFFS);
    Serial.print(" bytes");

    Serial.print(" | Running on Core ");
    ;
    Serial.println(Log[idx].iCore);
  }
}
void setup() {
  // Your existing setup code
  delay(5000);
  Serial.begin(9600);
  Serial.println("[Lab05.ex01] Circular buffer");
  Serial.println();
  Serial.println("Mounting SPIFFS...");
  if (!SPIFFS.begin(true)) {
    Serial.println("Failed to mount SPIFFS");
    return;
  }
  Serial.println("SPIFFS mounted successfully");
}
void loop() {
  // Your existing loop code
  logAdd();
  logPrint();
  delay(10000);  // Log every 10 seconds
}
