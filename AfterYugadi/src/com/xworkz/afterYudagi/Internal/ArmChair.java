package com.xworkz.afterYudagi.Internal;

public class ArmChair extends Furniture{
   public ArmChair()
   {
       System.out.println("Running no args const");
   }

   @Override
    public void assemble()
    {
        System.out.println("Running assemble in Armchair");
    }
    @Override
    public void move()
    {
        System.out.println("Running move in Armchair");
    }
    @Override
    public void clean()
    {
        System.out.println("Running clean in Armchair");
    }
    @Override
    public void paint()
    {
        System.out.println("Painting Armchair");
    }
    @Override
    public void  sell()
    {
        System.out.println("selling Armchair");
    }

}
