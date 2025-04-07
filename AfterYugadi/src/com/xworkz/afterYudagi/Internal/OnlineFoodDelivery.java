package com.xworkz.afterYudagi.Internal;

public class OnlineFoodDelivery extends FoodDelivery{
    public OnlineFoodDelivery() {
        System.out.println("OnlineFoodDelivery Constructor");
    }
@Override
    public void browseRestaurants() {
        System.out.println("Online FoodDelivery is browsing available restaurants");
    }
@Override
    public void placeOrder() {
        System.out.println("Online FoodDelivery is placing an order");
    }
@Override
    public void trackOrder() {
        System.out.println("Online FoodDelivery is tracking the order");
    }
@Override
    public void makePayment() {
        System.out.println("Online FoodDelivery is processing payment");
    }
@Override
    public void provideFeedback() {
        System.out.println("Online FoodDelivery is collecting customer feedback");
    }
    public void eat()
    {
        System.out.println("Yum Yum");
    }
}
