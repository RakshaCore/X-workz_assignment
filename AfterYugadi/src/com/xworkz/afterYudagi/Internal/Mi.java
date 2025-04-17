package com.xworkz.afterYudagi.Internal;

public class Mi extends Laptop{
    public Mi()
    {
        System.out.println("No arg const of mi ");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in MI");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in MI");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in MI");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in MI");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in MI");
    }
}
