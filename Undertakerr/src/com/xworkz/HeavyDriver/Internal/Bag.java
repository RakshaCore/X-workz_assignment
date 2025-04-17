package com.xworkz.HeavyDriver.Internal;

public interface Bag {
    void open();

    void close();

    void changeZip();

    default void displayBagStatus() {
        System.out.println("Displaying bag status...");
    }
}
