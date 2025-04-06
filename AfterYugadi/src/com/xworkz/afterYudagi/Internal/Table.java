package com.xworkz.afterYudagi.Internal;

public class Table extends Furniture{
    public Table()
    {
        System.out.println("Running no args contr of table");
    }

    @Override
    public void assemble()
    {
        System.out.println("Running assemble in Table");
    }
    @Override
    public void move()
    {
        System.out.println("Running move in Table");
    }
    @Override
    public void clean()
    {
        System.out.println("Running clean in Table");
    }
    @Override
    public void paint()
    {
        System.out.println("Painting Table");
    }
    @Override
    public void  sell()
    {
        System.out.println("Selll");
    }
}
