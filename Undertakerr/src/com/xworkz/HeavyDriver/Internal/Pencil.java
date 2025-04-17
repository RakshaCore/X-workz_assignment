package com.xworkz.HeavyDriver.Internal;

public interface Pencil {
    void draw();
    void erase();
    void sharpen();
    default void write() {
        System.out.println("Writing with pencil");
    }

}
