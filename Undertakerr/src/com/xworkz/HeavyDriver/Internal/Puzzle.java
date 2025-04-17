package com.xworkz.HeavyDriver.Internal;

public class Puzzle implements Game {

    @Override
    public void play() {
        System.out.println("Puzzle is being played");
    }

    @Override
    public void pause() {
        System.out.println("Puzzle is paused");
    }

    @Override
    public void stop() {
        System.out.println("Puzzle is stopped");
    }
    @Override
    public void displayGameStatus() {
        System.out.println("Displaying puzzle game status with default method...");
    }

}
