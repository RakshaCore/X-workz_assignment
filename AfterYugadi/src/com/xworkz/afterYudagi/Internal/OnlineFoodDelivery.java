package com.xworkz.afterYudagi.Internal;

public class OnlineFoodDelivery extends FoodDelivery{
    public OnlineFoodDelivery() {
        System.out.println("OnlineFoodDelivery Constructor");
    }
@Override
    public void browseRestaurants() {
        System.out.println("FoodDelivery is browsing available restaurants");
    }
@Override
    public void placeOrder() {
        System.out.println("FoodDelivery is placing an order");
    }
@Override
    public void trackOrder() {
        System.out.println("FoodDelivery is tracking the order");
    }
@Override
    public void makePayment() {
        System.out.println("FoodDelivery is processing payment");
    }
@Override
    public void provideFeedback() {
        System.out.println("FoodDelivery is collecting customer feedback");
    }
}
