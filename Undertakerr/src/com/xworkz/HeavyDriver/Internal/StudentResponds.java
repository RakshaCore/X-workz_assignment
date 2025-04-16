package com.xworkz.HeavyDriver.Internal;

public class StudentResponds implements Responder{
    @Override
    public void respond() {
        System.out.println("Student is responding");
    }

    @Override
    public void acknowledge() {
        System.out.println("Student is acknowledging");
    }

    @Override
    public void reject() {
        System.out.println("Student is rejecting");
    }
}
