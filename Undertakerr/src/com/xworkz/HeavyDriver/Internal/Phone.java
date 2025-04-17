package com.xworkz.HeavyDriver.Internal;

public class Phone implements Device {
    @Override
    public void powerOn() {
        System.out.println("Phone is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Phone is powered off.");
    }

    @Override
    public void reset() {
        System.out.println("Phone is resetting.");
    }
    @Override
    public void connectToWiFi() {
        System.out.println("Phone is connecting to WiFi.");
    }
}
