package com.xworkz.HeavyDriver.Internal;

public class SteeringWheel implements  VehiclePart{

    @Override
    public void getPartName() {
        System.out.println("Steering Wheel");

    }

    @Override
    public void getPartType() {
        System.out.println("Control");

    }

    @Override
    public void getPartMaterial() {
        System.out.println("Plastic");

    }
    @Override
    public void getPartFunction() {
        System.out.println("The steering wheel is used to control the direction of the vehicle.");
    }

}
