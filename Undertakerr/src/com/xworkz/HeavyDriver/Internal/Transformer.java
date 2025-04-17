package com.xworkz.HeavyDriver.Internal;

public interface Transformer {

    void enhance();

    void upgrade();

    void optimize();
    default void logTransformation() {
        System.out.println("Logging transformation...");
    }

}
