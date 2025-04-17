package com.xworkz.HeavyDriver.Internal;

public interface Processor {
    void process();
    void execute();
    void manage();
    default void logProcess() {
        System.out.println("Logging process...");
    }
}
