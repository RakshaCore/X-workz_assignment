package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIVirtualStylist;
import com.xworkz.afterYudagi.Internal.Stylist;

public class BellaHadid {
    public void modelbro(Stylist stylist)
    {
        stylist.suggestOutfits();
        stylist.matchAccessories();
        stylist.recommendHairstyle();
        stylist.provideFashionTrends();
        stylist.saveStylePreferences();

        if(stylist instanceof AIVirtualStylist)
        {
            AIVirtualStylist aiVirtualStylist=(AIVirtualStylist) stylist;
            aiVirtualStylist.model();
        }
    }
}
