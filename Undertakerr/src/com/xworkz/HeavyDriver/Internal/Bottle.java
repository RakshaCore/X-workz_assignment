package com.xworkz.HeavyDriver.Internal;

public interface Bottle {
    void fill();

    void drink();

    void clean();

    default void store() {
        System.out.println("Storing the bottle");
    }
}
