package com.xworkz.HeavyDriver.Internal;

public interface NotificationSender {
    void sendNotification();
    void scheduleNotification();
    void cancelNotification();
    default void logNotification() {
        System.out.println("Logging notification...");
    }
}
