package com.xworkz.HeavyDriver.Internal;

public interface Switch {
    void on();

    void off();

    void check();
    default void displaySwitchStatus() {
        System.out.println("Displaying switch status...");
    }
}
