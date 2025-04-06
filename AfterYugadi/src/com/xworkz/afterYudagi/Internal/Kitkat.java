package com.xworkz.afterYudagi.Internal;

public class Kitkat extends Chocolate{
    public Kitkat()
    {
        System.out.println("no arg const of kitkat");
    }
    @Override
    public void eat()
    {
        System.out.println("eat in choclate");
    }
    @Override
    public void gift()
    {
        System.out.println("gift in choclate");
    }
    @Override
    public void melt()
    {
        System.out.println("Melt in choclate");
    }

}
