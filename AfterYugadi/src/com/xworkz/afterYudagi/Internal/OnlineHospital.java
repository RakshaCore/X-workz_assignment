package com.xworkz.afterYudagi.Internal;

public class OnlineHospital extends Hospital{
    public OnlineHospital() {
        System.out.println("OnlineHospital Constructor");
    }
@Override
    public void admitPatient() {
        System.out.println("Hospital is admitting a patient");
    }
@Override
    public void conductSurgery() {
        System.out.println("Hospital is conducting a surgery");
    }
@Override
    public void dispenseMedicine() {
        System.out.println("Hospital is dispensing medicine");
    }
@Override
    public void provideCheckup() {
        System.out.println("Hospital is providing a checkup");
    }
@Override
    public void generateReport() {
        System.out.println("Hospital is generating a medical report");
    }
}
