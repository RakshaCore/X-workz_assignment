package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.FoodDelivery;
import com.xworkz.afterYudagi.Internal.OnlineFoodDelivery;

public class Zomata {
    public void delivery(FoodDelivery foodDelivery)
    {
        foodDelivery.browseRestaurants();
        foodDelivery.placeOrder();
        foodDelivery.trackOrder();
        foodDelivery.makePayment();
        foodDelivery.provideFeedback();
        if (foodDelivery instanceof OnlineFoodDelivery)
        {
            OnlineFoodDelivery onlineFoodDelivery=(OnlineFoodDelivery) foodDelivery;
            onlineFoodDelivery.eat();
        }
    }
}
