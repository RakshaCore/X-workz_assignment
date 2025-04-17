package com.xworkz.HeavyDriver.Internal;

public interface Pen {
    void write();
    void draw();
    void refill();
    default void clean() {
        System.out.println("Cleaning the pen...");
    }

}
