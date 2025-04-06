package com.xworkz.afterYudagi.Internal;

public class OnlineLogistics extends Logistics{
    public OnlineLogistics() {
        System.out.println("OnlineLogistics Constructor");
    }
@Override
    public void receiveOrder() {
        System.out.println("Logistics is receiving an order");
    }
@Override
    public void processShipment() {
        System.out.println("Logistics is processing the shipment");
    }
@Override
    public void trackPackage() {
        System.out.println("Logistics is tracking the package");
    }
@Override
    public void deliverPackage() {
        System.out.println("Logistics is delivering the package");
    }
@Override
    public void handleReturns() {
        System.out.println("Logistics is handling returned packages");
    }
}
