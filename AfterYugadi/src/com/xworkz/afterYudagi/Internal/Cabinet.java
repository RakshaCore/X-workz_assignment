package com.xworkz.afterYudagi.Internal;

public class Cabinet extends Furniture{
    public Cabinet()
    {
        System.out.println("Running no args const of Cabinet");
    }


@Override
public void assemble()
    {
        System.out.println("Running assemble in Cabinet");
    }
    @Override

    public void move()
    {
        System.out.println("Running move in Cabinet");
    }
    @Override

    public void clean()
    {
        System.out.println("Running clean in Cabinet");
    }
    @Override

    public void paint()
    {
        System.out.println("Painting Cabinet");
    }
    @Override

    public void  sell()
    {
        System.out.println("Selll");
    }
}
