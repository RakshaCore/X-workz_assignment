package com.xworkz.afterYudagi.Internal;

public class Samsung extends Tv{
    public  Samsung()
    {
        System.out.println("No arg conts of Samsung");
    }

    @Override
   public void buy()
   {
       System.out.println("RUnning buy in Samsung");
   }
   @Override
   public void sell()
   {
       System.out.println("Running sell in Samsung");
   }
   @Override
   public void watch()
   {
       System.out.println("Running watch in Samsung");
   }
   @Override
   public void deliver()
   {
       System.out.println("Running deliver in Samsung");
   }
   @Override
   public void off()
   {
       System.out.println("Running off in Samsung");
   }
}
