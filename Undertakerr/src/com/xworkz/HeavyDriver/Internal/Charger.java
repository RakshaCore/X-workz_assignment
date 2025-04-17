package com.xworkz.HeavyDriver.Internal;

public interface Charger {
    void chargeDevice();
    void fastCharge();
    void wirelessCharge();
    default void charge() {
        System.out.println("Charging device...");
    }
}
