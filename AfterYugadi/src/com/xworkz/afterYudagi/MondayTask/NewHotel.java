package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.Hotel;
import com.xworkz.afterYudagi.Internal.OnlineHotel;

public class NewHotel {
    public void hotelhandle(Hotel hotel)
    {
        hotel.bookRoom();
        hotel.serveFood();
        hotel.provideCleaning();
        hotel.handleCheckOut();
        hotel.manageAmenities();

        if (hotel instanceof OnlineHotel)
        {
            OnlineHotel onlineHotel=(OnlineHotel)hotel;
            onlineHotel.changeThings();
        }
    }
}
