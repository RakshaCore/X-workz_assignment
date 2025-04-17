package com.xworkz.HeavyDriver.Internal;

public class TVRemote implements Remote {
    @Override
    public void start() {
        System.out.println("TV Remote is starting.");
    }

    @Override
    public void stop() {
        System.out.println("TV Remote is stopping.");
    }

    @Override
    public void check() {
        System.out.println("Checking TV Remote.");
    }
    @Override
    public void displayRemoteStatus() {
        System.out.println("Displaying TV remote status with default method...");
    }
}
