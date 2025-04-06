package com.xworkz.afterYudagi.Internal;

public class ThumbsUp extends Juice{
    public ThumbsUp()
    {
        System.out.println("No args const");
    }

    @Override
    public void drink()
    {
        System.out.println("Drink ThumbsUp");
    }
    @Override
    public void gift()
    {
        System.out.println("gift ThumbsUp");
    }
    @Override
    public void throwit()
    {
        System.out.println("Throw in ThumbsUp");
    }
    @Override
    public void loose()
    {
        System.out.println("Loose the ThumbsUp");
    }
    public  void prepare()
    {
        System.out.println("Prepare");
    }
}
