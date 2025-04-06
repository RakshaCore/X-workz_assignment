package com.xworkz.afterYudagi.Internal;

public class Bracelet extends Accessories{
    public  Bracelet()
    {
        System.out.println("No arg const");
    }

    @Override
    public void wear()
    {
        System.out.println("Wear in Bracelet");
    }
    @Override
    public void remove()
    {
        System.out.println("Remove in Bracelet");
    }
    @Override
    public void gift()
    {
        System.out.println("gift in Bracelet");
    }
    @Override
    public void throwit()
    {
        System.out.println("Throw in Bracelet");
    }
    @Override
    public void loose()
    {
        System.out.println("Loose the Bracelets");
    }
}
