package com.xworkz.afterYudagi.Internal;

public class Lenovo extends Laptop{
    public Lenovo()
    {
        System.out.println("Mo arg const of Lenevo");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Lenevo");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Lenevo");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Lenevo");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Lenevo");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Lenevo");
    }
}
