package com.xworkz.afterYudagi.Internal;

public class Eat5star extends  Chocolate{
    public  Eat5star()
    {
        System.out.println("No args const of 5star");
    }

    @Override
    public void eat()
    {
        System.out.println("eat in Eat5star");
    }
    @Override
    public void gift()
    {
        System.out.println("gift in Eat5star");
    }
    @Override
    public void melt()
    {
        System.out.println("Melt in Eat5star");
    }
}
