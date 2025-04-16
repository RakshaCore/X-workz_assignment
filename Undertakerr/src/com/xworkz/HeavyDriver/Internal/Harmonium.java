package com.xworkz.HeavyDriver.Internal;

public class Harmonium implements Instrument{
    @Override
    public void play() {
        System.out.println("Playing the harmonium");

    }

    @Override
    public void tune() {
        System.out.println("Tuning the harmonium");

    }

    @Override
    public void clean() {
        System.out.println("Cleaning the harmonium");

    }
}
