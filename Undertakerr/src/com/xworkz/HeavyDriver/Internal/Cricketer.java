package com.xworkz.HeavyDriver.Internal;

public class Cricketer implements Player {

    @Override
    public void play() {
        System.out.println("Cricketer is playing");
    }

    @Override
    public void quit() {
        System.out.println("Cricketer has quit");
    }

    @Override
    public void score() {
        System.out.println("Cricketer has scored");
    }
    @Override
    public void displayPlayerStatus() {
        System.out.println("Displaying cricketer status...");
    }
}
