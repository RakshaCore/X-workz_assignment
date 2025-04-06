package com.xworkz.afterYudagi.Internal;

public class Bed extends Furniture{
   public Bed()
    {
        System.out.println("running no args of Bed");
    }

    @Override
    public void assemble()
    {
        System.out.println("Running assemble in Bed");
    }
    @Override
    public void move()
    {
        System.out.println("Running move in Bed");
    }
    @Override
    public void clean()
    {
        System.out.println("Running clean in Bed");
    }
    @Override
    public void paint()
    {
        System.out.println("Painting Bed");
    }
    @Override
    public void  sell()
    {
        System.out.println("Selll");
    }
}
