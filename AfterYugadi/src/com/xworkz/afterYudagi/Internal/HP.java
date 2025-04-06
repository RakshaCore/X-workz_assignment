package com.xworkz.afterYudagi.Internal;

public class HP extends Laptop{
    public HP()
    {
        System.out.println("No arg comts of Hp");
    }
    @Override
    public void buy()
    {
        System.out.println("RUnning buy in HP");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in HP");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in HP");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in HP");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in HP");
    }
}
