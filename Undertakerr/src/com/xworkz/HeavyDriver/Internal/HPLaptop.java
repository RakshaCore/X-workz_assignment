package com.xworkz.HeavyDriver.Internal;

public class HPLaptop implements Laptop {

    @Override
    public void powerOn() {
        System.out.println("HP Laptop is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("HP Laptop is powered off.");
    }

    @Override
    public void connectToInternet() {
        System.out.println("HP Laptop is connected to the internet.");
    }
}
