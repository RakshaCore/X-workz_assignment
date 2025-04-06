package com.xworkz.afterYudagi.Internal;

public class OnlineRestaurant extends Restaurant{
    public OnlineRestaurant() {
        System.out.println("OnlineRestaurant Constructor");
    }
    @Override
    public void takeOrders() {
        System.out.println("Restaurant is taking orders");
    }
    @Override
    public void prepareFood() {
        System.out.println("Restaurant is preparing food");
    }
    @Override
    public void serveCustomers() {
        System.out.println("Restaurant is serving customers");
    }
    @Override
    public void manageBilling() {
        System.out.println("Restaurant is managing billing");
    }
    @Override
    public void cleanTables() {
        System.out.println("Restaurant is cleaning tables");
    }
}
