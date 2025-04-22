package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Charger;

public class MobileDevice {
    private Charger charger;
    public MobileDevice(Charger charger) {
        this.charger = charger;
        System.out.println("Running MobileDevice");
    }
    public void discharge() {
        if (this.charger != null) {
            this.charger.charge();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
