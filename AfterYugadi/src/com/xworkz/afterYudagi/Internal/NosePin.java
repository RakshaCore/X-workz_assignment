package com.xworkz.afterYudagi.Internal;

public class NosePin extends Accessories
{
    public  NosePin()
    {
        System.out.println("No arg const");
    }

    @Override
    public void wear()
    {
        System.out.println("Wear in Nosepin");
    }
    @Override
    public void remove()
    {
        System.out.println("Remove in Nosepin");
    }
    @Override
    public void gift()
    {
        System.out.println("gift in Nosepin");
    }
    @Override
    public void throwit()
    {
        System.out.println("Throw in Nosepin");
    }
    @Override
    public void loose()
    {
        System.out.println("Loose the Nosepin");
    }
}
