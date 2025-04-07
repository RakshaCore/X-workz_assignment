package com.xworkz.afterYudagi.Internal;

public class OnlineGroceryStore extends GroceryStore{
    public OnlineGroceryStore() {
        System.out.println("OnlineGroceryStore Constructor");
    }
    @Override
    public void browseItems() {
        System.out.println("Online GroceryStore is displaying available items");
    }
@Override
    public void addToCart() {
        System.out.println("Online GroceryStore is adding item to cart");
    }
@Override
    public void processPayment() {
        System.out.println("Online GroceryStore is processing payment");
    }
@Override
    public void deliverOrder() {
        System.out.println("Online GroceryStore is delivering order");
    }
@Override
    public void handleReturns() {
        System.out.println("Online GroceryStore is handling returns");
    }
    public void rate()
    {
        System.out.println("Rate");
    }
}
