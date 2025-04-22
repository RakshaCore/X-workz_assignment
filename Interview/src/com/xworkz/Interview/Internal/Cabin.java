package com.xworkz.Interview.Internal;

public  class Cabin extends Office{
    @Override
    public void work()
    {
        System.out.println("Work method Overriden");
    }
    @Override
    public void workFromHome() {
        System.out.println("Inherited");
    }
}
