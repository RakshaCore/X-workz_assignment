package com.xworkz.HeavyDriver.Internal;

public class Hammer implements Tool{
    @Override
    public void cut() {
        System.out.println("Hammer is cutting");
    }

    @Override
    public void grind() {
        System.out.println("Hammer is grinding");
    }

    @Override
    public void polish() {
        System.out.println("Hammer is polishing");
    }
}
