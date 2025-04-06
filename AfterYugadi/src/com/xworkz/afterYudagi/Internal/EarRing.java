package com.xworkz.afterYudagi.Internal;

import java.security.PublicKey;

public class EarRing extends Accessories{
    public  EarRing()
    {
        System.out.println("No arg const");
    }

    @Override
    public void wear()
    {
        System.out.println("Wear in EarRing");
    }
    @Override
    public void remove()
    {
        System.out.println("Remove in EarRing");
    }
    @Override
    public void gift()
    {
        System.out.println("gift in EarRing");
    }
    @Override
    public void throwit()
    {
        System.out.println("Throw in EarRing");
    }
    @Override
    public void loose()
    {
        System.out.println("Loose the EarRing");
    }
}
