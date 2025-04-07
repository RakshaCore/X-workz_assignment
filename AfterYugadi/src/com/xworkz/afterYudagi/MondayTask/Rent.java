package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.OnlineRealEstate;
import com.xworkz.afterYudagi.Internal.RealEstate;

public class Rent {
    public void takeRent(RealEstate realEstate)
    {
        realEstate.listProperty();
        realEstate.scheduleVisit();
        realEstate.processSale();
        realEstate.signContract();
        realEstate.manageRental();

        if (realEstate instanceof OnlineRealEstate)
        {
            OnlineRealEstate onlineRealEstate=(OnlineRealEstate) realEstate;
            onlineRealEstate.leave();
        }
    }
}
