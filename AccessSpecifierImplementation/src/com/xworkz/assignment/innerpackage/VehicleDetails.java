package com.xworkz.assignment.innerpackage;

public class VehicleDetails {
    public  String model="Supra";
    private int year=2025;
    String color="Red";

    public void vehiclePublic(){
        System.out.println("Public method accessed: Vehicle Details");
    }
    void vehiclePackageLevel(){
        System.out.println("Package-Level method accessed");
    }
    private void vehiclePrivate() {
        System.out.println("Private method accessed");
    }
}
