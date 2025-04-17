package com.xworkz.HeavyDriver.Internal;

public interface Calculator {
    void squareRoot();

    void power();

    void modulus();

    default void add() {
        System.out.println("Addition method");
    }
}
