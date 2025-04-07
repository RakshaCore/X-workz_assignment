package com.xworkz.afterYudagi.Internal;

public class OnlineSmartHome extends SmartHome{
    public OnlineSmartHome() {
        System.out.println("OnlineSmartHome Constructor");
    }
    @Override
    public void turnOnLights() {
        System.out.println("Online-SmartHome is turning on the lights");
    }
    @Override
    public void adjustThermostat() {
        System.out.println("Online-SmartHome is adjusting the thermostat");
    }
    @Override
    public void lockDoors() {
        System.out.println("Online-SmartHome is locking the doors");
    }
    @Override
    public void controlCameras() {
        System.out.println("Online-SmartHome is controlling security cameras");
    }
    @Override
    public void playMusic() {
        System.out.println("Online-SmartHome is playing music");
    }
    public void feedback()
    {
        System.out.println("Lets give a feedback");
    }
}
