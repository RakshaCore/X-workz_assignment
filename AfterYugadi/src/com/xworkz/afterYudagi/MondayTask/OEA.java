package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.EmergencyAlert;
import com.xworkz.afterYudagi.Internal.OnlineEmergencyAlert;

public class OEA {
    public void emergency(EmergencyAlert alert)
    {
        alert.sendAlert();
        alert.trackEmergency();
        alert.notifyAuthorities();
        alert.provideGuidance();
        alert.logIncident();
        if (alert instanceof OnlineEmergencyAlert)
        {
            OnlineEmergencyAlert onlineEmergencyAlert=(OnlineEmergencyAlert) alert;
            onlineEmergencyAlert.Emergency();
        }
    }
}
