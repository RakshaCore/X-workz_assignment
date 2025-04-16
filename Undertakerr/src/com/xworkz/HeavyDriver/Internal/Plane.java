package com.xworkz.HeavyDriver.Internal;

public class Plane implements Flyer{
    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing");
    }

    @Override
    public void takeOff() {
        System.out.println("Plane is taking off");
    }
}
