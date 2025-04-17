package com.xworkz.HeavyDriver.Internal;

public interface Chair {
    void move();
    void rotate();
    void adjustHeight();
    default void recline() {
        System.out.println("The chair can recline.");
    }

}
