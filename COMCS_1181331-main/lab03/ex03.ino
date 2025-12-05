#define LED_BUILTIN 2
void setup() {
  // put your setup code here, to run once:
  delay(2000);
  // initialize digital pin LED_BUILTIN as an output.
  Serial.begin(9600);
  pinMode(LED_BUILTIN, OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(LED_BUILTIN, HIGH); // turn the LED on (HIGH is the voltage level)
  Serial.println("LED:On");
  delay(2000); // wait for 2 seconds
  digitalWrite(LED_BUILTIN, LOW); // turn the LED off by making the voltage LOW
  Serial.println("LED:Off");
  delay(1000); // wait for a second
}
