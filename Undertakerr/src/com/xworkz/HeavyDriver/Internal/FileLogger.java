package com.xworkz.HeavyDriver.Internal;

public class FileLogger implements Logger {

    @Override
    public void log() {
        System.out.println("Logging to file...");
    }

    @Override
    public void logError() {
        System.out.println("Logging error to file...");
    }

    @Override
    public void logWarning() {
        System.out.println("Logging warning to file...");
    }
    @Override
    public void logInfo() {
        System.out.println("Logging info to file...");
    }
}
