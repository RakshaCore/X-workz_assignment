package com.xworkz.lambdaexp.internal;

import com.xworkz.lambdaexp.external.Bottle;

public class Customer {
    public void buy(Bottle bottle)
    {
        boolean value=bottle.test(5);
        System.out.println("Value is"+value);
    }
}