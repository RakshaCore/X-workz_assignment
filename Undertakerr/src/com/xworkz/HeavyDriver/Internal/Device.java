package com.xworkz.HeavyDriver.Internal;

public interface Device {
    void powerOn();

    void powerOff();

    void reset();
    default void connectToWiFi() {
        System.out.println("Connecting to WiFi...");
    }
}
