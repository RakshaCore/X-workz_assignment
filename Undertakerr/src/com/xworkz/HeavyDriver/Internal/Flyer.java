package com.xworkz.HeavyDriver.Internal;

public interface Flyer {
    void fly();

    void land();

    void takeOff();
    default void logFlight() {
        System.out.println("Logging flight activity...");
    }

}
