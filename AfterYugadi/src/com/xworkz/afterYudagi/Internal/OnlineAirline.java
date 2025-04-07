package com.xworkz.afterYudagi.Internal;

public class OnlineAirline extends Airline {
    public OnlineAirline() {
        System.out.println("OnlineAirline Constructor");
    }
    @Override
    public void bookTicket() {
        System.out.println("Airline is booking a ticket");
    }

    @Override
    public void scheduleFlight() {
        System.out.println("Airline is scheduling a flight");
    }

    @Override
    public void boardPassengers() {
        System.out.println("Airline is boarding passengers");
    }

    @Override
    public void serveMeals() {
        System.out.println("Airline is serving meals");
    }

    @Override
    public void landPlane() {
        System.out.println("Airline is landing the plane");
    }
    public void crash()
    {
        System.out.println("911");
    }
}