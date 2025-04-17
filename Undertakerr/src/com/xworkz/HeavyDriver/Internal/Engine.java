package com.xworkz.HeavyDriver.Internal;

public interface Engine {
    void start();
    void stop() ;
    public abstract void check() ;
    default void logEngine() {
        System.out.println("Logging engine activity...");
    }

}
