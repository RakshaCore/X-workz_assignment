package com.xworkz.afterYudagi.Internal;

public class ElectricVehicle extends Vehicle{
    public ElectricVehicle() {
        System.out.println("ElectricVehicle Constructor");
    }
    @Override
    public void startEngine() {
        System.out.println("Vehicle is starting the engine");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle is applying brakes");
    }
    @Override
    public void refuel() {
        System.out.println("Vehicle is refueling");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle is stopping the engine");
    }


}
