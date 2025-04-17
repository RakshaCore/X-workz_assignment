package com.xworkz.HeavyDriver.Internal;

public class LetUsRest implements Rest {

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void relax() {
        System.out.println("Relaxing");
    }

    @Override
    public void pamper() {
        System.out.println("Pampering");
    }

     @Override
     public void meditate() {
         System.out.println("Meditating in a specific way");
     }

}
