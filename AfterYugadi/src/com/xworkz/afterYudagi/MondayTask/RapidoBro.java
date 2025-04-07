package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.OnlineRideSharing;
import com.xworkz.afterYudagi.Internal.RideSharing;

public class RapidoBro {
    public void rapidokaro(RideSharing rideSharing)
    {
        rideSharing.bookRide();
        rideSharing.assignDriver();
        rideSharing.trackRide();
        rideSharing.calculateFare();
        rideSharing.giveRating();

        if(rideSharing instanceof OnlineRideSharing)
        {
            OnlineRideSharing onlineRideSharing=(OnlineRideSharing) rideSharing;
            onlineRideSharing.choosePartner();
        }
    }
}
