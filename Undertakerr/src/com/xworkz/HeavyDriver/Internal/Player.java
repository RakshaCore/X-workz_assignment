package com.xworkz.HeavyDriver.Internal;

public interface Player {
    void play();
    void quit();
    void score();
    default void displayPlayerStatus() {
        System.out.println("Displaying player status...");
    }
}
