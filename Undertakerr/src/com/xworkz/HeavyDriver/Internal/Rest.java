package com.xworkz.HeavyDriver.Internal;

public interface Rest {
    void sleep();
    void eat();
    void relax();
    void pamper();
    default void meditate()
    {
        System.out.println("Meditating");
    }
}
