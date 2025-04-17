package com.xworkz.HeavyDriver.Internal;

public class CreditCardPayment implements PaymentProcessor {

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }

    @Override
    public void refundPayment() {
        System.out.println("Refunding credit card payment...");
    }

    @Override
    public void generateInvoice() {
        System.out.println("Generating invoice for credit card payment...");
    }
    @Override
    public void logPayment() {
        System.out.println("Logging credit card payment...");
    }

}
