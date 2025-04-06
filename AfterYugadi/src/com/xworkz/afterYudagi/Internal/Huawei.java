package com.xworkz.afterYudagi.Internal;

public class Huawei extends Phone{
    public Huawei()
    {
        System.out.println("No arg Const of Huawei");
    }

    @Override
    public void buy()
    {
        System.out.println("RUnning buy in Huawei");
    }
    @Override
    public void sell()
    {
        System.out.println("Running sell in Huawei");
    }
    @Override
    public void watch()
    {
        System.out.println("Running watch in Huawei");
    }
    @Override
    public void deliver()
    {
        System.out.println("Running deliver in Huawei");
    }
    @Override
    public void off()
    {
        System.out.println("Running off in Huawei");
    }
}
