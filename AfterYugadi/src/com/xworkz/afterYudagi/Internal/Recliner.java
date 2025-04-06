package com.xworkz.afterYudagi.Internal;

public class Recliner extends Furniture{
    public Recliner()
    {
        System.out.println("Running no args of recliner");
    }

    @Override
    public void assemble()
    {
        System.out.println("Running assemble in Recliner");
    }
    @Override
    public void move()
    {
        System.out.println("Running move in Recliner");
    }
    @Override
    public void clean()
    {
        System.out.println("Running clean in Recliner");
    }
    @Override
    public void paint()
    {
        System.out.println("Painting Recliner");
    }
    @Override
    public void  sell()
    {
        System.out.println("Selll");
    }
}
