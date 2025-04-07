package com.xworkz.afterYudagi.Internal;

public class OnlineRideSharing extends RideSharing{
    public OnlineRideSharing() {
        System.out.println("OnlineRideSharing Constructor");
    }
    @Override
    public void bookRide() {
        System.out.println("Online RideSharing is booking a ride");
    }
    @Override
    public void assignDriver() {
        System.out.println("Online RideSharing is assigning a driver");
    }
    @Override
    public void trackRide() {
        System.out.println("Online RideSharing is tracking a ride");
    }
    @Override
    public void calculateFare() {
        System.out.println("Online RideSharing is calculating fare");
    }
    @Override
    public void giveRating() {
        System.out.println("Online RideSharing is allowing user to rate the ride");
    }

    public void choosePartner()
    {
        System.out.println("I want a Partner");
    }
}
