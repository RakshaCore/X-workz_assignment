package com.xworkz.HeavyDriver.Internal;

public class WaterBottle implements Bottle
{
    @Override
    public void fill() {
        System.out.println("Filling the water bottle");
    }

    @Override
    public void drink() {
        System.out.println("Drinking from the water bottle");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the water bottle");
    }

    @Override
    public void store() {
        System.out.println("Storing the water bottle");
    }
}
