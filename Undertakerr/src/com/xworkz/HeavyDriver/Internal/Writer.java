package com.xworkz.HeavyDriver.Internal;

public interface Writer {
    void write();
    void edit();
    void publish();
    default void proofread() {
        System.out.println("The writer can proofread.");
    }


}
