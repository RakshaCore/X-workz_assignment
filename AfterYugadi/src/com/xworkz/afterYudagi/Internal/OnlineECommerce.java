package com.xworkz.afterYudagi.Internal;

public class OnlineECommerce extends ECommerce{
    public OnlineECommerce() {
        System.out.println("OnlineECommerce Constructor");
    }

@Override
    public void browseProducts() {
        System.out.println("Online-ECommerce is displaying products");
    }
@Override
    public void addToCart() {
        System.out.println("Online-ECommerce is adding a product to the cart");
    }
@Override
    public void checkout() {
        System.out.println("Online-ECommerce is processing checkout");
    }
@Override
    public void makePayment() {
        System.out.println("Online-ECommerce is processing payment");
    }
@Override
    public void trackOrder() {
        System.out.println("Online ECommerce is tracking an order");
    }
    public void returnProduct()
    {
        System.out.println("Return the product");
    }
}
