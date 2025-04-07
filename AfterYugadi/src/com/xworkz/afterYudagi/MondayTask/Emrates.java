package com.xworkz.afterYudagi.MondayTask;
import com.xworkz.afterYudagi.Internal.Airline;
import com.xworkz.afterYudagi.Internal.OnlineAirline;

public class Emrates{
public void runAirline(Airline airline) {
    airline.bookTicket();
    airline.scheduleFlight();
    airline.boardPassengers();
    airline.serveMeals();
    airline.landPlane();

    if(airline instanceof OnlineAirline)
    {
        OnlineAirline onlineAirline=(OnlineAirline) airline;
        onlineAirline.crash();
    }


}
}
