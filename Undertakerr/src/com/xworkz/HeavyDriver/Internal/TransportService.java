package com.xworkz.HeavyDriver.Internal;

public interface TransportService {
    void transport();
    void deliver();
    void track();
    default void logTransport() {
        System.out.println("Logging transport activity...");
    }
}
