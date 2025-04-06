package com.xworkz.afterYudagi.Internal;

public class Apple extends Phone{
    public Apple()
    {
        System.out.println("No arg const in Apple");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Apple");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Apple");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Apple");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Apple");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Apple");
    }
}
