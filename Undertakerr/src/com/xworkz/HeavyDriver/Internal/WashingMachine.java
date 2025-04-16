package com.xworkz.HeavyDriver.Internal;

public class WashingMachine implements
Appliance {
    @Override
    public void turnOn() {
        System.out.println("Washing machine is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing machine is turned off.");
    }

    @Override
    public void setMode() {
        System.out.println("Washing machine mode is set.");
    }
}
