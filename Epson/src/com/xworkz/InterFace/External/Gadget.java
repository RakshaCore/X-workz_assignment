package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Battery;

public class Gadget {
    private Battery battery;
    public Gadget(Battery battery) {
        this.battery = battery;
        System.out.println("Running Gadget");
    }
    public void powerOn() {
        if (this.battery != null) {
            this.battery.showBatteryStatus();
        } else {
            System.err.println("NULLLLL");
        }
    }

}
