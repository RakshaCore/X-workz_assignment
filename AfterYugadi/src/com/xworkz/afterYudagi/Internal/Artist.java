package com.xworkz.afterYudagi.Internal;

public class Artist extends Art
{
    public Artist()
    {
        System.out.println("Running no arg const of artist");
    }
    @Override
    public void buy()
    {
        System.out.println("Running buy in Artist");
    }
    @Override
    public void frame()
    {
        System.out.println("RUnning frame in artist");
    }
    @Override
    public void create()
    {
        System.out.println("Running create in artist");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in artist");
    }
    @Override
    public void fix()
    {
        System.out.println("Running fix in artist");
    }
}
