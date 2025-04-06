package com.xworkz.afterYudagi.Internal;

public class OnlineFlightBooking extends FlightBooking{
    public OnlineFlightBooking() {
        System.out.println("OnlineFlightBooking Constructor");
    }
@Override
    public void searchFlights() {
        System.out.println("FlightBooking is searching for flights");
    }
@Override
    public void bookTicket() {
        System.out.println("FlightBooking is booking a ticket");
    }
@Override
    public void cancelTicket() {
        System.out.println("FlightBooking is canceling a ticket");
    }
@Override
    public void checkIn() {
        System.out.println("FlightBooking is handling check-in");
    }
@Override
    public void trackFlight() {
        System.out.println("FlightBooking is tracking flight status");
    }
}
