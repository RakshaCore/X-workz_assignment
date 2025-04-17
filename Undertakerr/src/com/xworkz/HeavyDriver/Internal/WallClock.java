package com.xworkz.HeavyDriver.Internal;

public class WallClock implements Clock {
    @Override
    public void showTime() {
        System.out.println("Showing time on wall clock...");
    }

    @Override
    public void setAlarm() {
        System.out.println("Setting alarm on wall clock...");
    }

    @Override
    public void snoozeAlarm() {
        System.out.println("Snoozing alarm on wall clock...");
    }
    @Override
    public void displayTime() {
        System.out.println("Displaying time on wall clock with default method...");
    }

}
