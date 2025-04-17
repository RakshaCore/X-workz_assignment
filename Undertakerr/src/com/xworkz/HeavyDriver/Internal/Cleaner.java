package com.xworkz.HeavyDriver.Internal;

public interface Cleaner {
    void clean();

    void wash();

    void sanitize();

    default void displayCleanerStatus() {
        System.out.println("Displaying cleaner status...");
    }
}
