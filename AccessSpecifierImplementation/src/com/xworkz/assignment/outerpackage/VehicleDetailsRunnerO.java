package com.xworkz.assignment.outerpackage;

import com.xworkz.assignment.innerpackage.VehicleDetails;

public class VehicleDetailsRunnerO {
    public static void main(String[] args) {
        VehicleDetails vehicle = new VehicleDetails();

        vehicle.vehiclePublic();

        System.out.println("Vehicle Model: " + vehicle.model);
        
    }
}
