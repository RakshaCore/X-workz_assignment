package com.xworkz.HeavyDriver.Internal;

public interface EventListener {
    void onEvent();
    void onError();
    void onWarning();
    default void onInfo() {
        System.out.println("Logging info...");
    }
}
