package com.xworkz.HeavyDriver.Internal;

public class HB2Pencil implements Pencil{
    @Override
    public void draw() {
        System.out.println("Drawing with HB2 pencil");

    }

    @Override
    public void erase() {
        System.out.println("Erasing with HB2 pencil");

    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening HB2 pencil");

    }
    @Override
    public void write() {
        System.out.println("Writing with HB2 pencil");
    }
}
