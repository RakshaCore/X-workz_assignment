package com.xworkz.HeavyDriver.Internal;

public interface Drink {
    void pour();
    void sip();
    void finish();
    default void serve() {
        System.out.println("Serving drink...");
    }
}
