package com.xworkz.afterYudagi.Runner;

import com.xworkz.afterYudagi.Internal.Tshirt;

public class TshirtRunner {
    public static void main(String[] args) {
        Tshirt tshirt=new Tshirt("Xworkz", "Red",150);
        Tshirt tshirt1=new Tshirt("Xworkz","Red",150);
        boolean value=tshirt1.equals(tshirt);
        System.out.println("Value is "+value);
    }
}
