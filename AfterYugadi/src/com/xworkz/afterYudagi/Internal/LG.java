package com.xworkz.afterYudagi.Internal;

public class LG extends Laptop{
    public LG()
    {
        System.out.println("No arg const");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in LG");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in LG");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in LG");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in LG");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in LG");
    }
}
