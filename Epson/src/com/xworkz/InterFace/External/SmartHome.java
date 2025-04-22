package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Light;

public class SmartHome {
    private Light light;
    public SmartHome(Light light) {
        this.light = light;
        System.out.println("Running SmartHome");
    }
    public void turnOn() {
        if (this.light != null) {
            this.light.on();
        } else {
            System.err.println("NULLLLL");
        }
    }

}
