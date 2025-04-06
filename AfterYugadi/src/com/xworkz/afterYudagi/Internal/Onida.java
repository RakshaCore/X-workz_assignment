package com.xworkz.afterYudagi.Internal;

public class Onida extends Tv {
    public Onida()
    {
        System.out.println("No arg const in Onida");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Onida");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Onida");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Onida");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Onida");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Onida");
    }
}
