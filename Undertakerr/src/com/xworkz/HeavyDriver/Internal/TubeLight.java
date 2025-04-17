package com.xworkz.HeavyDriver.Internal;

public class TubeLight implements Light{
    @Override
    public void syncWithApp() {
        System.out.println("Syncing with app...");
    }

    @Override
    public void adjustBrightnessAutomatically() {
        System.out.println("Adjusting brightness automatically...");
    }

    @Override
    public void respondToVoiceCommands() {
        System.out.println("Responding to voice commands...");
    }
    @Override
    public void displayLightStatus() {
        System.out.println("Displaying light status with default method...");
    }
}
