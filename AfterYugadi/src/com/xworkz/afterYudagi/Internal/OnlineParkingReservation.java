package com.xworkz.afterYudagi.Internal;

public class OnlineParkingReservation extends ParkingSystem {
    public OnlineParkingReservation() {
        System.out.println("Online Parking Reservation System Activated");
    }
@Override
    public void checkAvailability() {
        System.out.println("Checking  parking availability");
    }
@Override
    public void reserveSpot() {
        System.out.println("Reserving  a parking spot");
    }
@Override
    public void processPayment() {
        System.out.println("Processing  parking payment");
    }
@Override
    public void generateTicket() {
        System.out.println("Generating  parking ticket");
    }
@Override
    public void releaseSpot() {
        System.out.println("Releasing  parking spot");
    }
    public void bombEverything()
    {
        System.out.println("Bomb Everything");
    }
}
