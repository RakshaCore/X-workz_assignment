package com.xworkz.afterYudagi.Internal;

public class OnlineHotel extends Hotel{
    public OnlineHotel() {
        System.out.println("OnlineHotel Constructor");
    }
@Override
    public void bookRoom() {
        System.out.println("Hotel is booking a room");
    }
@Override
    public void serveFood() {
        System.out.println("Hotel is serving food");
    }
@Override
    public void provideCleaning() {
        System.out.println("Hotel is providing cleaning services");
    }
@Override
    public void handleCheckOut() {
        System.out.println("Hotel is handling check-out");
    }
@Override
    public void manageAmenities() {
        System.out.println("Hotel is managing amenities");
    }
}
