package com.xworkz.HeavyDriver.Internal;

public interface PaymentProcessor {
    void processPayment();
    void refundPayment();
    void generateInvoice();
    default void logPayment() {
        System.out.println("Logging payment...");
    }
}