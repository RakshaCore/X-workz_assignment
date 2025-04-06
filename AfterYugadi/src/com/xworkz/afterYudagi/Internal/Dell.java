package com.xworkz.afterYudagi.Internal;

public class Dell extends Laptop{
    public Dell()
    {
        System.out.println("NO arg of dell");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Dell");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Dell");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Dell");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Dell");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Dell");
    }
}
