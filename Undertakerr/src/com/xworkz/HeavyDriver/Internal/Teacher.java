package com.xworkz.HeavyDriver.Internal;

public class Teacher implements Communicator{
    @Override
    public void communicate() {
        System.out.println("Teacher is communicating");
    }

    @Override
    public void sendMessage() {
        System.out.println("Teacher is sending a message");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Teacher is receiving a message");
    }
    @Override
    public void logCommunication() {
        System.out.println("Logging teacher communication...");
    }

}
