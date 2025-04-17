package com.xworkz.HeavyDriver.Internal;

public interface Watch {
    void showTime();
    void setAlarm();
    void trackSteps();
    default void connectToPhone() {
        System.out.println("Connecting to phone...");
    }
}
