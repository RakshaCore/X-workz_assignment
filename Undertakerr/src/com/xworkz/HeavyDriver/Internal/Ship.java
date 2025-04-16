package com.xworkz.HeavyDriver.Internal;

public class Ship implements Swimmer{
    @Override
    public void swim() {
        System.out.println("Ship is swimming");
    }

    @Override
    public void dive() {
        System.out.println("Ship is diving");
    }

    @Override
    public void floatOnWater() {
        System.out.println("Ship is floating on water");
    }
}
