package com.xworkz.afterYudagi.Internal;

public class OnlineECommerce extends ECommerce{
    public OnlineECommerce() {
        System.out.println("OnlineECommerce Constructor");
    }

@Override
    public void browseProducts() {
        System.out.println("ECommerce is displaying products");
    }
@Override
    public void addToCart() {
        System.out.println("ECommerce is adding a product to the cart");
    }
@Override
    public void checkout() {
        System.out.println("ECommerce is processing checkout");
    }
@Override
    public void makePayment() {
        System.out.println("ECommerce is processing payment");
    }
@Override
    public void trackOrder() {
        System.out.println("ECommerce is tracking an order");
    }
}
