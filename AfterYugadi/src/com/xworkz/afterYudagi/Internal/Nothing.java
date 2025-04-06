package com.xworkz.afterYudagi.Internal;

public class Nothing extends Phone{
    public Nothing()
    {
        System.out.println("no args const of Nothing");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Nothing");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Nothing");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Nothing");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Nothing");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Nothing");
    }
}
