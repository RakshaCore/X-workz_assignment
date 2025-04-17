package com.xworkz.HeavyDriver.Internal;

public interface MobileApp {
    void install();

    void uninstall();

    void update();

    default void launch() {
        System.out.println("Launching mobile app...");
    }
}