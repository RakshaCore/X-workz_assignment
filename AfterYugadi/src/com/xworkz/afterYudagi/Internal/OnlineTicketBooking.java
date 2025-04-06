package com.xworkz.afterYudagi.Internal;

public class OnlineTicketBooking extends TicketBooking{
    public OnlineTicketBooking() {
        System.out.println("OnlineTicketBooking Constructor");
    }
    @Override
    public void searchEvents() {
        System.out.println("Online-TicketBooking is searching for events");
    }
    @Override
    public void selectSeats() {
        System.out.println("Online-TicketBooking is selecting seats");
    }
    @Override
    public void makePayment() {
        System.out.println("Online-TicketBooking is processing payment");
    }
    @Override
    public void generateTicket() {
        System.out.println("Online-TicketBooking is generating a ticket");
    }
    @Override
    public void cancelBooking() {
        System.out.println("Online-TicketBooking is canceling a booking");
    }
}
