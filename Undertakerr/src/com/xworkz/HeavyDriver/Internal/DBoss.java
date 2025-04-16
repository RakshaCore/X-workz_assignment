package com.xworkz.HeavyDriver.Internal;

public class DBoss implements Media{
    @Override
    public void play() {
        System.out.println("Playing media");
    }

    @Override
    public void pause() {
        System.out.println("Pausing media");
    }

    @Override
    public void stop() {
        System.out.println("Stopping media");
    }
}
