package com.xworkz.afterYudagi.Runner;

import com.xworkz.afterYudagi.Internal.ArmyVehicle;
import com.xworkz.afterYudagi.Internal.MRFTyre;
import com.xworkz.afterYudagi.Internal.Rubber;
import com.xworkz.afterYudagi.Internal.Tyre;

public class RubberRunner {
    public static void main(String[] args) {
        Rubber rubber=new Rubber();
        rubber.expand();
        //rubber.compress();

        Rubber rubber1=new Tyre();

        Tyre tyre=new Tyre();
        tyre.expand();
        tyre.compress();

        MRFTyre mrfTyre=new MRFTyre();
        mrfTyre.expand();
        mrfTyre.price();

        ArmyVehicle armyVehicle=new ArmyVehicle();
        armyVehicle.wheel(rubber);
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(mrfTyre);
    }
}
