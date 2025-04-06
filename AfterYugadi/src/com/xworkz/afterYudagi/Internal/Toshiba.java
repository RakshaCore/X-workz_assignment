package com.xworkz.afterYudagi.Internal;

public class Toshiba extends Laptop{
    public Toshiba()
    {
        System.out.println("No arg const of Toshiba ");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Toshiba");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Toshiba");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Toshiba");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Toshiba");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Toshiba");
    }
}
