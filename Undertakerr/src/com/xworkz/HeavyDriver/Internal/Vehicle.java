package com.xworkz.HeavyDriver.Internal;

public interface Vehicle {
    void start();
    void stop();
    void check();
    default void logVehicle() {
        System.out.println("Logging vehicle activity...");
    }
}
