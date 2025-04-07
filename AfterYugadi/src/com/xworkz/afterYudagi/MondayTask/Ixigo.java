package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.OnlineLearningPlatform;
import com.xworkz.afterYudagi.Internal.OnlineTicketBooking;
import com.xworkz.afterYudagi.Internal.TicketBooking;

public class Ixigo {
    public void download(TicketBooking ticketBooking)
    {
        ticketBooking.searchEvents();
        ticketBooking.selectSeats();
        ticketBooking.makePayment();
        ticketBooking.generateTicket();
        ticketBooking.cancelBooking();
        if (ticketBooking instanceof OnlineTicketBooking)
        {
            OnlineTicketBooking onlineTicketBooking=(OnlineTicketBooking) ticketBooking;
            onlineTicketBooking.rate();
        }
    }
}
