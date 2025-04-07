package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.FlightBooking;
import com.xworkz.afterYudagi.Internal.OnlineFlightBooking;

public class MakeMyTrip {
    public void book(FlightBooking flightBooking)
    {
        flightBooking.searchFlights();
        flightBooking.bookTicket();
        flightBooking.cancelTicket();
        flightBooking.checkIn();
        flightBooking.trackFlight();
        if(flightBooking instanceof OnlineFlightBooking)
        {
            OnlineFlightBooking onlineFlightBooking=(OnlineFlightBooking) flightBooking;
            onlineFlightBooking.rate();
        }
    }
}
