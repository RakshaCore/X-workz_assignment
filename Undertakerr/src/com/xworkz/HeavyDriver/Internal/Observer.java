package com.xworkz.HeavyDriver.Internal;

public interface Observer {
    void update();
    void notifyObservers();
    void registerObserver();
    default void logUpdate() {
        System.out.println("Logging update activity...");
    }
}
