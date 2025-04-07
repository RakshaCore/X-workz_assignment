package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.SmartWasteManagement;
import com.xworkz.afterYudagi.Internal.WasteManagement;

public class SmartWasteMgmt {
    public void wastedekhna(WasteManagement waste)
    {
        waste.collectWasteData();
        waste.optimizeCollectionRoutes();
        waste.categorizeWaste();
        waste.monitorRecyclingEfforts();
        waste.alertForOverfilledBins();

        if(waste instanceof SmartWasteManagement)
        {
            SmartWasteManagement smartWasteManagement=(SmartWasteManagement) waste;
            smartWasteManagement.feedback();
        }
    }
}
