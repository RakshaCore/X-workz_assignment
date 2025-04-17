package com.xworkz.HeavyDriver.Internal;

public class OfficeChair implements Chair {
    @Override
    public void move() {
        System.out.println("The office chair can move.");
    }

    @Override
    public void rotate() {
        System.out.println("The office chair can rotate.");
    }

    @Override
    public void adjustHeight() {
        System.out.println("The office chair height can be adjusted.");
    }
    @Override
    public void recline() {
        System.out.println("The office chair can recline.");
    }
}
