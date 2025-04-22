package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Sensor;

public class WeatherStation {
    private Sensor sensor;
    public WeatherStation(Sensor sensor) {
        this.sensor = sensor;
        System.out.println("Running WeatherStation");
    }
    public void collectData() {
        if (this.sensor != null) {
            this.sensor.detectMovement();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
