package com.xworkz.afterYudagi.Internal;

public class Xmas extends Festival{
    public Xmas()
    {
        System.out.println("No arg const of Xmas");
    }
    @Override
    public void celebrate()
    {
        System.out.println("Running Celebrate in Xmas");
    }
    @Override
    public void eatSweets()
    {
        System.out.println("Running eatsweets  in Xmas");
    }
    @Override
    public void buyNewDress()
    {
        System.out.println("Running buyNewDress in Xmas");
    }
    @Override
    public void burnCrackers()
    {
        System.out.println("Running burnCrackers in Xmas");
    }
    @Override
    public void decoration()
    {
        System.out.println("Running decoration in Xmas");
    }
}
