package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.VehicleMode;

public class DrivingSystem {
    private VehicleMode vehicleMode;

    public DrivingSystem(VehicleMode vehicleMode) {
        this.vehicleMode = vehicleMode;
        System.out.println("Running DrivingSystem");
    }

    public void drive() {
        if (this.vehicleMode != null) {
            this.vehicleMode.accelerate();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
