package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Payment;

public class PaymentApp {
    private Payment payment;
    public  PaymentApp(Payment payment) {
        this.payment = payment;
        System.out.println("Running PaymentApp");
    }
    public void makepay() {
        if (this.payment != null) {
            this.payment.pay();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
