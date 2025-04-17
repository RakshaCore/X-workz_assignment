package com.xworkz.HeavyDriver.Internal;

public interface Language {
    void speak();
    void write();
    void read();
    default void translate() {
        System.out.println("Translating language...");
    }
}
