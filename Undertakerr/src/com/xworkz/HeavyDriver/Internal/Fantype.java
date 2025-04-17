package com.xworkz.HeavyDriver.Internal;

public interface Fantype {
    void play();
    void practice();
    void compete();
    default void show() {
        System.out.println("Showing fan type...");
    }
}
