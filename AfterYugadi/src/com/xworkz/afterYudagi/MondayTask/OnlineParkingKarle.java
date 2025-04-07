package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.OnlineParkingReservation;
import com.xworkz.afterYudagi.Internal.ParkingSystem;

public class OnlineParkingKarle {
    public void parkBro(ParkingSystem parking)
    {
        parking.checkAvailability();
        parking.reserveSpot();
        parking.processPayment();
        parking.generateTicket();
        parking.releaseSpot();

        if(parking instanceof OnlineParkingReservation)
        {
            OnlineParkingReservation onlineParkingReservation=(OnlineParkingReservation) parking;
            onlineParkingReservation.bombEverything();
        }
    }
}
