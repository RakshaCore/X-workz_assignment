package com.xworkz.HeavyDriver.Internal;

public class MobileCharger implements Charger {

    @Override
    public void chargeDevice() {
        System.out.println("Charging device...");
    }

    @Override
    public void fastCharge() {
        System.out.println("Fast charging device...");
    }

    @Override
    public void wirelessCharge() {
        System.out.println("Wireless charging device...");
    }
}
