package com.xworkz.HeavyDriver.Internal;

public interface VehiclePart {
    void getPartName();

    void getPartType();

    void getPartMaterial();

    default void getPartFunction() {
        System.out.println("The vehicle part has a specific function.");
    }
}
