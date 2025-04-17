package com.xworkz.HeavyDriver.Internal;

public interface Game {
    void play();

    void pause();

    void stop();
    default void displayGameStatus() {
        System.out.println("Displaying game status...");
    }
}
