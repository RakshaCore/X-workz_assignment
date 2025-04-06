package com.xworkz.afterYudagi.Internal;

public class OnlineStore extends Store{
    public OnlineStore()
    {
        System.out.println("OnlineStore Constructor");
    }
@Override
    public void sellProducts() {
        System.out.println("Store is selling products");
    }
@Override
    public void acceptReturns() {
        System.out.println("Store is accepting returns");
    }
@Override
    public void manageInventory() {
        System.out.println("Store is managing inventory");
    }
@Override
    public void offerDiscounts() {
        System.out.println("Store is offering discounts");
    }
@Override
    public void provideCustomerService() {
        System.out.println("Store is providing customer service");
    }
}
