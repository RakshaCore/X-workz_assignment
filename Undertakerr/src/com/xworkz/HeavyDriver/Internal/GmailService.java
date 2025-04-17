package com.xworkz.HeavyDriver.Internal;

public class GmailService implements EmailService {

    @Override
    public void sendEmail() {
        System.out.println("Sending email using Gmail service...");
    }

    @Override
    public void receiveEmail() {
        System.out.println("Receiving email using Gmail service...");
    }

    @Override
    public void deleteEmail() {
        System.out.println("Deleting email using Gmail service...");
    }
    @Override
    public void logEmail() {
        System.out.println("Logging email using Gmail service...");
    }
}
