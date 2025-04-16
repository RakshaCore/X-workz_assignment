package com.xworkz.HeavyDriver.Internal;

public class TeddyBear implements Gift{
    @Override
    public void wrap() {
        System.out.println("Wrapping the teddy bear");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering the teddy bear");
    }

    @Override
    public void open() {
        System.out.println("Opening the teddy bear");
    }
}
