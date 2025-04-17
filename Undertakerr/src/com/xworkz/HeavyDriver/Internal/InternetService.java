package com.xworkz.HeavyDriver.Internal;

public interface InternetService {
    void connectToInternet();

    void disconnectFromInternet();

    void checkConnectionSpeed();

    default void getServiceProvider() {
        System.out.println("The internet service provider is XYZ.");
    }
}
