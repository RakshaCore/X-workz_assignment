package com.xworkz.HeavyDriver.Internal;

public class CabService implements TransportService{
    @Override
    public void transport() {
        System.out.println("Transporting passengers...");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering passengers to their destination...");
    }

    @Override
    public void track() {
        System.out.println("Tracking the cab's location...");
    }
}
