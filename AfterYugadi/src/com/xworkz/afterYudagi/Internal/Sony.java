package com.xworkz.afterYudagi.Internal;

public class Sony extends Tv{
    public Sony()
    {
        System.out.println("No arg const in SOny");
    }
    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Sony");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Sony");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Sony");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Sony");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Sony");
    }
}
