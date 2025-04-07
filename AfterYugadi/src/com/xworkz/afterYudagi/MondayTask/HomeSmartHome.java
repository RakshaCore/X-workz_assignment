package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.OnlineSmartHome;
import com.xworkz.afterYudagi.Internal.SmartHome;

public class HomeSmartHome {
    public void operate(SmartHome smartHome)
    {
        smartHome.turnOnLights();
        smartHome.adjustThermostat();
        smartHome.lockDoors();
        smartHome.controlCameras();
        smartHome.playMusic();
        if(smartHome instanceof OnlineSmartHome)
        {
            OnlineSmartHome onlineSmartHome=(OnlineSmartHome) smartHome;
            onlineSmartHome.feedback();
        }
    }
}
