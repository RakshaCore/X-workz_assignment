package com.xworkz.HeavyDriver.Internal;

public interface Box {
    void open();

    void close();

    void lock();

    default void displayBoxStatus() {
        System.out.println("Displaying box status...");
    }

}
