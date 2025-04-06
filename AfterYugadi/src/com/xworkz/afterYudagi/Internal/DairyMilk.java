package com.xworkz.afterYudagi.Internal;

public class DairyMilk extends Chocolate{
    public DairyMilk()
    {
        System.out.println("No arg const of dm");
    }

    @Override
    public void eat()
    {
        System.out.println("eat in Dairymilk");
    }
    @Override
    public void gift()
    {
        System.out.println("gift in Dairymilk");
    }
    @Override
    public void melt()
    {
        System.out.println("Melt in Dairymilk");
    }
}

