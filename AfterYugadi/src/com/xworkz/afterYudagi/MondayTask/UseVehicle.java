package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.ElectricVehicle;
import com.xworkz.afterYudagi.Internal.Vehicle;

public class UseVehicle {
    public void service(Vehicle vehicle)
    {
        vehicle.startEngine();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.refuel();
        vehicle.stopEngine();

        if(vehicle instanceof ElectricVehicle)
        {
            ElectricVehicle electricVehicle=(ElectricVehicle) vehicle;
            electricVehicle.trash();
        }

    }
}
