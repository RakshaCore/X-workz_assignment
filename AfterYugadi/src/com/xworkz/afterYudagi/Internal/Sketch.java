package com.xworkz.afterYudagi.Internal;

public class Sketch extends Art{
    public Sketch()
    {
        System.out.println("No arg const of Sketch");
    }

    @Override
    public void buy()
    {
        System.out.println("Running buy in Sketch");
    }
    @Override
    public void frame()
    {
        System.out.println("RUnning frame in Sketch");
    }
    @Override
    public void create()
    {
        System.out.println("Running create in Sketch");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Sketch");
    }
    @Override
    public void fix()
    {
        System.out.println("Running fix in Sketch");
    }
}
