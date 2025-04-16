package com.xworkz.HeavyDriver.Internal;

public class BlackPen implements  Pen{
    @Override
    public void write() {
        System.out.println("Writing with black pen");

    }

    @Override
    public void draw() {
        System.out.println("Drawing with black pen");

    }

    @Override
    public void refill() {
        System.out.println("Refilling black pen");

    }
}
