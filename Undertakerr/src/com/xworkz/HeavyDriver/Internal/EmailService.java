package com.xworkz.HeavyDriver.Internal;

public interface EmailService {
    void sendEmail();
    void receiveEmail();
    void deleteEmail();
    default void logEmail() {
        System.out.println("Logging email...");
    }

}
