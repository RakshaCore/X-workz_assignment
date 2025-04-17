package com.xworkz.HeavyDriver.Internal;

public interface Instrument {
    void play();
    void tune();
    void clean();
    default void repair()
    {
        System.out.println("Repairing the instrument");
    }

}
