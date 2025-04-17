package com.xworkz.HeavyDriver.Internal;

public interface MillkShake {
    void prepare();
    void serve();
    void drink();
    default void enjoy() {
        System.out.println("Enjoying the milkshake!");
    }

}
