package com.xworkz.HeavyDriver.Internal;

public interface Book {
    void read();
    void write();
    void publish();
    default void bookmark() {
        System.out.println("Bookmarking the book...");
    }

}
