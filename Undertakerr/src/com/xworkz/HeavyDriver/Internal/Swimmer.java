package com.xworkz.HeavyDriver.Internal;

public interface Swimmer {
    void swim();
    void dive();
    void floatOnWater();
    default void logSwim() {
        System.out.println("Logging swim activity...");
    }

}
