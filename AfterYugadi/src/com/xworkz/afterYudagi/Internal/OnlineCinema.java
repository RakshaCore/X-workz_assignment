package com.xworkz.afterYudagi.Internal;

public class OnlineCinema extends Cinema {
    public OnlineCinema() {
        System.out.println("OnlineCinema Constructor");
    }

    @Override
    public void listMovies() {
        System.out.println("Cinema is listing available movies");
    }
@Override
    public void bookTicket() {
        System.out.println("Cinema is booking a movie ticket");
    }
@Override
    public void selectSeats() {
        System.out.println("Cinema is allowing seat selection");
    }
@Override
    public void sellSnacks() {
        System.out.println("Cinema is selling snacks");
    }
@Override
    public void cancelTicket() {
        System.out.println("Cinema is canceling a ticket");
    }
    public void location()
    {
        System.out.println("Location of ");
    }
}
