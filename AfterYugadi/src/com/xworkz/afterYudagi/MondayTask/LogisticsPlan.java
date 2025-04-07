package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.Logistics;
import com.xworkz.afterYudagi.Internal.OnlineLogistics;

public class LogisticsPlan {
    public void plan(Logistics logistics)
    {
        logistics.receiveOrder();
        logistics.processShipment();
        logistics.trackPackage();
        logistics.deliverPackage();
        logistics.handleReturns();

        if(logistics instanceof OnlineLogistics)
        {
            OnlineLogistics onlineLogistics=(OnlineLogistics) logistics;
            onlineLogistics.feedback();
        }
    }
}
