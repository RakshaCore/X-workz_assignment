package com.xworkz.afterYudagi.Internal;

public class OnlineRealEstate extends RealEstate {
    public OnlineRealEstate() {
        System.out.println("OnlineRealEstate Constructor");
    }
@Override
    public void listProperty() {
        System.out.println("Real estate agency is listing a property");
    }
@Override
    public void scheduleVisit() {
        System.out.println("Real estate agency is scheduling a visit");
    }
@Override
    public void processSale() {
        System.out.println("Real estate agency is processing a property sale");
    }
@Override
    public void signContract() {
        System.out.println("Real estate agency is signing a contract");
    }
@Override
    public void manageRental() {
        System.out.println("Real estate agency is managing a rental property");
    }
}
