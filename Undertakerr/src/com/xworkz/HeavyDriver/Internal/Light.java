package com.xworkz.HeavyDriver.Internal;

public interface Light {
    void syncWithApp();

    void adjustBrightnessAutomatically();

    void respondToVoiceCommands();

    default void displayLightStatus() {
        System.out.println("Displaying light status...");
    }
}
