package com.xworkz.HeavyDriver.Internal;

public interface Renderer {
    void render();
    void display();
    void refresh();
    default void logRender() {
        System.out.println("Logging render activity...");
    }
}
