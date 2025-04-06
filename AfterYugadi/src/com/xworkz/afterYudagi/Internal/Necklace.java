package com.xworkz.afterYudagi.Internal;

public class Necklace extends Accessories{
    public  Necklace()
    {
        System.out.println("No arg const");
    }

    @Override
    public void wear()
    {
        System.out.println("Wear in Necklace");
    }
    @Override
    public void remove()
    {
        System.out.println("Remove in Necklace");
    }
    @Override
    public void gift()
    {
        System.out.println("gift in Necklace");
    }
    @Override
    public void throwit()
    {
        System.out.println("Throw in Necklace");
    }
    @Override
    public void loose()
    {
        System.out.println("Loose the Necklace");
    }
}
