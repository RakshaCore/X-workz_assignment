package com.xworkz.HeavyDriver.Internal;

public class WiFi implements InternetService {

    @Override
    public void connectToInternet() {
        System.out.println("Connecting to WiFi...");
    }

    @Override
    public void disconnectFromInternet() {
        System.out.println("Disconnecting from WiFi...");
    }

    @Override
    public void checkConnectionSpeed() {
        System.out.println("Checking WiFi connection speed...");
    }


}
