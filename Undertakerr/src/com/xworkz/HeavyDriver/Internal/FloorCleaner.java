package com.xworkz.HeavyDriver.Internal;

public class FloorCleaner implements Cleaner {

    @Override
    public void clean() {
        System.out.println("Floor is being cleaned");
    }

    @Override
    public void wash() {
        System.out.println("Floor is being washed");
    }

    @Override
    public void sanitize() {
        System.out.println("Floor is being sanitized");
    }

    @Override
    public void displayCleanerStatus() {
        System.out.println("Displaying cleaner status with default method...");
    }
}
