void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600); // This value represents the Character encoder (This value has to match the one present in the serial monitor)
}

void loop() {
  // put your main code here, to run repeatedly:
  Serial.println("Hello World");
  delay(1000); // wait for a second
}
