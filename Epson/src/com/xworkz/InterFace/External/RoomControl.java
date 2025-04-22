package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Fan;

public class RoomControl {
    Fan fan;
    public RoomControl(Fan fan) {
        this.fan = fan;
        System.out.println("Running RoomControl");
    }
    public void controlFan() {
        if (this.fan != null) {
            this.fan.rotate();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
