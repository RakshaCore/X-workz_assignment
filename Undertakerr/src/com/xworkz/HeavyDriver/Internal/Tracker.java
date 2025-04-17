package com.xworkz.HeavyDriver.Internal;

public interface Tracker {
    void track();
    void monitor();
    void log();
    default void logTracking() {
        System.out.println("Logging tracking activity...");
    }
}
