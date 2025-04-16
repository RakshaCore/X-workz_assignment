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

}
