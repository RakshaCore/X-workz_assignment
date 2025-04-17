package com.xworkz.HeavyDriver.Internal;

public interface Gift {
    void wrap();
    void deliver();
    void open();
    default void thankYou() {
        System.out.println("Thank you for the gift!");
    }
}
