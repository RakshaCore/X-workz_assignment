package com.xworkz.afterYudagi.Internal;

public class Asus extends Laptop{
    public Asus()
    {
        System.out.println("No arg const of asus");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Asus");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Asus");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Asus");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Asus");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Asus");
    }
}
