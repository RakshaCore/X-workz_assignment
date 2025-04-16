package com.xworkz.HeavyDriver.Internal;

public class TextBook implements Book{
    @Override
    public void read() {
        System.out.println("Reading the textbook");
    }

    @Override
    public void write() {
        System.out.println("Writing in the textbook");
    }

    @Override
    public void publish() {
        System.out.println("Publishing the textbook");
    }
}
