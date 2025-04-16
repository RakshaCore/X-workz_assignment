package com.xworkz.HeavyDriver.Internal;

public class Server implements Tracker{
    @Override
    public void track() {
        System.out.println("Tracking server activity...");
    }

    @Override
    public void monitor() {
        System.out.println("Monitoring server performance...");
    }

    @Override
    public void log() {
        System.out.println("Logging server events...");
    }
}
