package com.xworkz.lambdaexp.runner;

import com.xworkz.lambdaexp.external.Bottle;
import com.xworkz.lambdaexp.internal.Customer;

public class CustomerRunner {
    public static void main(String[] args) {
//        Bottle bottle=(int no)->{
//            System.out.println("Running Lambda impl "+no);
//            if(no>0)
//            {
//                return true;
//            }
//            return false;
//        };

//        Bottle bottle=(no)->(no>100);
//        Customer customer=new Customer();
//        customer.buy(bottle);
        Customer customer=new Customer();
        customer.buy((no )-> no>100);
    }
}
