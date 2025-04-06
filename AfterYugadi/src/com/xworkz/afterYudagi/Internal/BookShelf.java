package com.xworkz.afterYudagi.Internal;

public class BookShelf extends Furniture{
    public BookShelf()
    {
        System.out.println("Running no args of Bookshelf");
    }

    @Override
    public void assemble()
    {
        System.out.println("Running assemble in Bookshelf");
    }
    @Override
    public void move()
    {
        System.out.println("Running move in Bookshelf");
    }
    @Override
    public void clean()
    {
        System.out.println("Running clean in Bookshelf");
    }
    @Override
    public void paint()
    {
        System.out.println("Painting Bookshelf");
    }
    @Override
    public void  sell()
    {
        System.out.println("Selll");
    }
}
