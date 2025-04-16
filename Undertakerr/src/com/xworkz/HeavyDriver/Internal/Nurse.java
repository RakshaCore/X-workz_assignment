package com.xworkz.HeavyDriver.Internal;

public class Nurse implements Renderer{
    @Override
    public void render() {
        System.out.println("Nurse is rendering");
    }

    @Override
    public void display() {
        System.out.println("Nurse is displaying");
    }

    @Override
    public void refresh() {
        System.out.println("Nurse is refreshing");
    }
}
