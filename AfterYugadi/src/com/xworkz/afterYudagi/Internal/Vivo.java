package com.xworkz.afterYudagi.Internal;

public class Vivo extends Phone{
    public Vivo()
    {
        System.out.println("No arg const of Vivo");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Vivo");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Vivo");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Vivo");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Vivo");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Vivo");
    }
}
