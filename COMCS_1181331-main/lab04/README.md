##ex01
#1. What does WiFi.mode(WIFI_STA), and why is it important for scanning?
The STA mode is used to connect the ESP32 to a Wi-Fi network, provided by an Access Point.

#2. How can you tell if a network is open or secured from the output?
Serial.println((WiFi.encryptionType(i) == WIFI_AUTH_OPEN) ? " " : "*");
with this we can tell if its open " " or secured "*"

#3. What does a more negative RSSI value (like -80 dBm) mean about the signal?
Not Good. Minimum signal strength for basic connectivity. Packet
delivery may be unreliable.

##ex02
#1. If more than one user connects at the same time, how would the ESP32 handle the webrequests?
Sequencially in a queue

#2. How could you modify the web interface to display the current state of the LED?
adding a new GET/Status that uses digitalRead(pin) where pin is the LED_BUILTIN constant. see ./ex02.ino

#3. Suggest changes to the program so that a log of the last 10 LED on/off actions is available in the serial monitor.
when an LED on/off is received save a log to an array like structure, and shift the first element when pushing a new one into it, like a vector 

##ex03

##ex04

##ex05
#1. Why do you need to start Bluetooth with SerialBT.begin("...")?
SerialBT.begin(name) is needed to initialize the Bluetooth interface. This method will handle all the lower level initialization, so we can use the Bluetooth functionality without having to worry about what happens under the hood. if an error occurs false is returned

#2. What feedback does the ESP32 give after each LED action?
it prints the given status to the SerialBT

#3. What would happen if you sent other characters (not '1' or '0')?
nothing, it'll wait for the next input
