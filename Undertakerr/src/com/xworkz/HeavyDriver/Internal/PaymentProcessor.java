package com.xworkz.HeavyDriver.Internal;

public interface PaymentProcessor {
    void processPayment();
    void refundPayment();
    void generateInvoice();
}