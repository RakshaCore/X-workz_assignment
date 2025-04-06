package com.xworkz.afterYudagi.Internal;

public class Refrigerator extends Appliance{
    public Refrigerator() {
        System.out.println("No-argument constructor: Refrigerator");
    }
    @Override
    public void powerOn() {
        System.out.println("Appliance is powered on");
    }
    @Override
    public void powerOff() {
        System.out.println("Appliance is powered off");
    }
    @Override
    public void warranty() {
        System.out.println("Appliance has a warranty");
    }
    @Override
    public void maintenance() {
        System.out.println("Appliance requires maintenance");
    }
    @Override
    public void brand() {
        System.out.println("Appliance brand information");
    }

}
