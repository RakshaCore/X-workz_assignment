package com.xworkz.HeavyDriver.Internal;

public interface Media {
    void play();
    void pause();
    void stop();
    default void rewind() {
        System.out.println("Rewinding media");
    }

}
