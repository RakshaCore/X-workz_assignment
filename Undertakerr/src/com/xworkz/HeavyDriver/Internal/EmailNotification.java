package com.xworkz.HeavyDriver.Internal;

public class EmailNotification implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("Sending email notification...");
    }

    @Override
    public void scheduleNotification() {
        System.out.println("Scheduling email notification...");
    }

    @Override
    public void cancelNotification() {
        System.out.println("Cancelling email notification...");
    }
    @Override
    public void logNotification() {
        System.out.println("Logging email notification...");
    }

}
