package com.xworkz.HeavyDriver.Internal;

public interface Laptop {
    void powerOn();

    void powerOff();

    void connectToInternet();
    default void runDiagnostics() {
        System.out.println("Running diagnostics on the laptop...");
    }
}

