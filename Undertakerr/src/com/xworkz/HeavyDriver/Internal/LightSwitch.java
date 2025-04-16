package com.xworkz.HeavyDriver.Internal;

public class LightSwitch implements Switch {
    @Override
    public void on() {
        System.out.println("Light is ON");
    }

    @Override
    public void off() {
        System.out.println("Light is OFF");
    }

    @Override
    public void check() {
        System.out.println("Checking the light status");
    }
}
