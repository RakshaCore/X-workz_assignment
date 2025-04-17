package com.xworkz.HeavyDriver.Internal;

public interface Sport {
    void play();
    void practice();
    void compete();
    default void show() {
        System.out.println("Showing sport...");
    }
}
