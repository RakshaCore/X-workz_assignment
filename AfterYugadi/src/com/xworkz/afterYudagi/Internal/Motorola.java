package com.xworkz.afterYudagi.Internal;

public class Motorola extends Phone{
    public Motorola()
    {
        System.out.println("No args Const of Motorola");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Motorola");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Motorola");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Motorola");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Motorola");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Motorola");
    }
}
