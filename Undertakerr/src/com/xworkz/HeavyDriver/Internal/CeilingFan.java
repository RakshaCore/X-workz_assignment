package com.xworkz.HeavyDriver.Internal;

public class CeilingFan implements Fantype{
    @Override
    public void play() {
        System.out.println("CeilingFan is playing");
    }

    @Override
    public void practice() {
        System.out.println("CeilingFan is practicing");
    }

    @Override
    public void compete() {
        System.out.println("CeilingFan is competing");
    }

    @Override
    public void show() {
        System.out.println("CeilingFan is showing");
    }

}
