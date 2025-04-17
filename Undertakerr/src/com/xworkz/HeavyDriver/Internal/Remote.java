package com.xworkz.HeavyDriver.Internal;

public interface Remote {
    void start();

    void stop();

    void check();
    default void displayRemoteStatus() {
        System.out.println("Displaying remote status...");
    }

}
