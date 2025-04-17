package com.xworkz.HeavyDriver.Internal;

public interface Communicator {
    void communicate();

    void sendMessage();

    void receiveMessage();
    default void logCommunication() {
        System.out.println("Logging communication...");
    }

}
