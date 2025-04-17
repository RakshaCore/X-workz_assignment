package com.xworkz.HeavyDriver.Internal;

public class Animal implements Transformer{
    @Override
    public void enhance() {
        System.out.println("Enhancing animal features");
    }

    @Override
    public void upgrade() {
        System.out.println("Upgrading animal capabilities");
    }

    @Override
    public void optimize() {
        System.out.println("Optimizing animal performance");
    }
    @Override
    public void logTransformation() {
        System.out.println("Logging animal transformation...");
    }
}
