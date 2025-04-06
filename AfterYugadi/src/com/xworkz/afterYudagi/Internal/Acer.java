package com.xworkz.afterYudagi.Internal;

public class Acer extends Laptop{
    public Acer()
    {
        System.out.println("No arg conts of Acer");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Acer");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Acer");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Acer");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Acer");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Acer");
    }
}
