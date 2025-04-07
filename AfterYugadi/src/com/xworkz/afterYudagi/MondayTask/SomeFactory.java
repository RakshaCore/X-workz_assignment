package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.Factory;
import com.xworkz.afterYudagi.Internal.OnlineFactory;

public class SomeFactory {
    public void runFactory(Factory factory)
    {
        factory.produceItem();
        factory.inspectItem();
        factory.packageItem();
        factory.shipItem();
        factory.maintainEquipment();

        if (factory instanceof OnlineFactory)
        {
            OnlineFactory onlineFactory=(OnlineFactory) factory;
            onlineFactory.replaceItem();
        }
    }
}
