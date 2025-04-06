package com.xworkz.afterYudagi.Internal;

public class Throne extends Furniture{
    public  Throne()
    {
        System.out.println("No args const of throne");
    }

    @Override
    public void assemble()
    {
        System.out.println("Running assemble in Throne");
    }
    @Override
    public void move()
    {
        System.out.println("Running move in Throne");
    }
    @Override
    public void clean()
    {
        System.out.println("Running clean in Throne");
    }
    @Override
    public void paint()
    {
        System.out.println("Painting Throne");
    }
    @Override
    public void  sell()
    {
        System.out.println("Selll");
    }
}
