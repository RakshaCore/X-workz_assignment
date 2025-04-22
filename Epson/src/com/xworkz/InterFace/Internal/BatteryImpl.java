package com.xworkz.InterFace.Internal;

public class BatteryImpl implements Battery {

    @Override
    public void showBatteryStatus() {
        System.out.println("Battery is full");
    }
}
