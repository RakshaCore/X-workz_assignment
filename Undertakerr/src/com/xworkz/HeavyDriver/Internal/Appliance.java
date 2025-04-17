package com.xworkz.HeavyDriver.Internal;

public interface Appliance {
    void turnOn();
    void turnOff();
    void setMode();

    default void reset() {
        System.out.println("Appliance is reset to default settings.");
    }
}
