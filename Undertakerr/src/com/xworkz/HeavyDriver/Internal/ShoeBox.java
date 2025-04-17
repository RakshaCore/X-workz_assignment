package com.xworkz.HeavyDriver.Internal;

public class ShoeBox implements Box{
    @Override
    public void open() {
        System.out.println("Opening the shoe box");
    }

    @Override
    public void close() {
        System.out.println("Closing the shoe box");
    }

    @Override
    public void lock() {
        System.out.println("Locking the shoe box");
    }
    @Override
    public void displayBoxStatus() {
        System.out.println("Displaying box status with default method...");
    }
}
