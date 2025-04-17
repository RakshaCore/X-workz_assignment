package com.xworkz.HeavyDriver.Internal;

public interface Website {
    void load();
    void refresh();
    void close();
    default void bookmark() {
        System.out.println("Bookmarking website...");
    }
}
