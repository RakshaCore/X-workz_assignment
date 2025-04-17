package com.xworkz.HeavyDriver.Internal;

public class English implements Language {

    @Override
    public void speak() {
        System.out.println("Speaking English");
    }

    @Override
    public void write() {
        System.out.println("Writing in English");
    }

    @Override
    public void read() {
        System.out.println("Reading English");
    }
    @Override
    public void translate() {
        System.out.println("Translating English");
    }
}
