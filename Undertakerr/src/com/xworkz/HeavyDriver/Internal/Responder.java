package com.xworkz.HeavyDriver.Internal;

public interface Responder {
    void respond();

    void acknowledge();

    void reject();
    default void logResponse() {
        System.out.println("Logging response activity...");
    }
}
