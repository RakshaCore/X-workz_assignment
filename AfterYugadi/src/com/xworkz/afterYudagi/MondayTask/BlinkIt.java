package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.GroceryStore;
import com.xworkz.afterYudagi.Internal.OnlineGroceryStore;

public class BlinkIt {
    public void Blinkitkaro(GroceryStore groceryStore)
    {
        groceryStore.browseItems();
        groceryStore.addToCart();
        groceryStore.processPayment();
        groceryStore.deliverOrder();
        groceryStore.handleReturns();

        if (groceryStore instanceof OnlineGroceryStore)
        {
            OnlineGroceryStore onlineGroceryStore=(OnlineGroceryStore) groceryStore;
            onlineGroceryStore.rate();
        }
    }
}
