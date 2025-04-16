package com.xworkz.HeavyDriver.Internal;

public class BookReader implements Writer {
    @Override
    public void write() {
        System.out.println("The book reader can write.");
    }

    @Override
    public void edit() {
        System.out.println("The book reader can edit.");
    }

    @Override
    public void publish() {
        System.out.println("The book reader can publish.");
    }
}
