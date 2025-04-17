package com.xworkz.HeavyDriver.Internal;

public interface Logger {
    void log();
    void logError();
    void logWarning();
    default void logInfo() {
        System.out.println("Logging info...");
    }

}
