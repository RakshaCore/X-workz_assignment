package com.xworkz.HeavyDriver.Internal;

public class Car implements Engine {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void check() {
        System.out.println("Checking the car");
    }
    @Override
    public void logEngine() {
        System.out.println("Logging car engine activity...");
    }
}
