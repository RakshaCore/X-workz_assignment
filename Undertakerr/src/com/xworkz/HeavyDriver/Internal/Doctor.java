package com.xworkz.HeavyDriver.Internal;

public class Doctor implements Observer {
    @Override
    public void update() {
        System.out.println("Doctor is updating the patient information");
    }

    @Override
    public void notifyObservers() {
        System.out.println("Doctor is notifying the observers");
    }

    @Override
    public void registerObserver() {
        System.out.println("Doctor is registering the observer");
    }
    @Override
    public void logUpdate() {
        System.out.println("Logging doctor update activity...");
    }
}
