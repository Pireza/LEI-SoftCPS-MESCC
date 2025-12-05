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
  bool ledStatus;
};
int logIndex = 0;

void writeLogEntry(int index, const LogEntry& entry) {
  File file = SPIFFS.open(filename, FILE_APPEND);
  if (!file) return;
  file.seek(index * sizeof(entry));
  file.write((const uint8_t*)&entry, sizeof(entry));
  file.close();
}

void logAdd() {
  LogEntry entry;
  entry.pos = logIndex;
  entry.timestamp = millis();
  entry.freeHeap = ESP.getFreeHeap();
  entry.totalSPIFFS = SPIFFS.totalBytes();
  entry.usedSPIFFS = SPIFFS.usedBytes();
  entry.availableSPIFFS = entry.totalSPIFFS - entry.usedSPIFFS;
  entry.iCore = xPortGetCoreID();
  entry.ledStatus = logIndex % 2 == 0;
  writeLogEntry(logIndex, entry);
  Serial.printf("%u\n", entry.ledStatus);
  if (entry.ledStatus == true)
    digitalWrite(2, HIGH);
  else
    digitalWrite(2, LOW);
  logIndex = (logIndex + 1) % LOG_SIZE;
}

void readLogEntries(const char* filename) {
  File file = SPIFFS.open(filename, FILE_READ);
  if (!file) {
    Serial.println("Failed to open file for reading");
    return;
  }
  while (file.available() >= sizeof(LogEntry)) {
    LogEntry entry;
    file.read((uint8_t*)&entry, sizeof(entry));
    
  }
  file.close();
}

void setup() {
  // Pre-allocate file if not present (optional for consistent size)
  if (!SPIFFS.exists(filename)) {
    File file = SPIFFS.open(filename, FILE_WRITE);
    LogEntry empty = {};
    for (int i = 0; i < LOG_SIZE; ++i)
      file.write((const uint8_t*)&empty, sizeof(empty));
    file.close();
  }
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
  pinMode(2, OUTPUT);
}
void loop() {
  // Your existing loop code
  logAdd();
  if ((logIndex % 2) == 0) {
    readLogEntries(filename);
  }
  delay(2000);  // Log every 2 seconds
}
