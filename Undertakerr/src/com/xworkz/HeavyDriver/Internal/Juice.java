package com.xworkz.HeavyDriver.Internal;

public class Juice implements  Drink{
    @Override
    public void pour() {
        System.out.println("Pouring juice...");
    }

    @Override
    public void sip() {
        System.out.println("Sipping juice...");
    }

    @Override
    public void finish() {
        System.out.println("Finishing juice...");
    }
    @Override
    public void serve() {
        System.out.println("Serving juice...");
    }
}
