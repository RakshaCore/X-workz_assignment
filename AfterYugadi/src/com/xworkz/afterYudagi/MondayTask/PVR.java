package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.Cinema;
import com.xworkz.afterYudagi.Internal.OnlineCinema;

public class PVR {
    public void checkOut(Cinema cinema)
    {
        cinema.listMovies();
        cinema.bookTicket();
        cinema.selectSeats();
        cinema.sellSnacks();
        cinema.cancelTicket();
if(cinema instanceof OnlineCinema)
{
    OnlineCinema onlineCinema=(OnlineCinema) cinema;
    onlineCinema.location();
}
    }
}
