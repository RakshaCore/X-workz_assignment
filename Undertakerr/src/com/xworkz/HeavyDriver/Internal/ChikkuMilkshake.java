package com.xworkz.HeavyDriver.Internal;

public class ChikkuMilkshake implements MillkShake {

    @Override
    public void prepare() {
        System.out.println("Preparing Chikku Milkshake...");
    }

    @Override
    public void serve() {
        System.out.println("Serving Chikku Milkshake...");
    }

    @Override
    public void drink() {
        System.out.println("Drinking Chikku Milkshake...");
    }
}
