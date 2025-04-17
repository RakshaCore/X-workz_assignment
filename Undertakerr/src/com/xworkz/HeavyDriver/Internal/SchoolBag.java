package com.xworkz.HeavyDriver.Internal;

public class SchoolBag implements Bag {

    @Override
    public void open() {
        System.out.println("Opening the school bag");
    }

    @Override
    public void close() {
        System.out.println("Closing the school bag");
    }

    @Override
    public void changeZip() {
        System.out.println("Changing the zip of the school bag");
    }
    @Override
    public void displayBagStatus() {
        System.out.println("Displaying bag status with default method...");
    }

}
