package com.xworkz.HeavyDriver.Internal;

public interface Clock {
    void showTime();

    void setAlarm();

    void snoozeAlarm();
    default void displayTime() {
        System.out.println("Displaying time on clock...");
    }
}
