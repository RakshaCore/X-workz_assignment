package com.xworkz.HeavyDriver.Internal;

public class SmartWatch implements Watch{
    @Override
    public void showTime() {
        System.out.println("The smartwatch shows the time.");
    }

    @Override
    public void setAlarm() {
        System.out.println("The smartwatch sets the alarm.");
    }

    @Override
    public void trackSteps() {
        System.out.println("The smartwatch tracks steps.");
    }
}
