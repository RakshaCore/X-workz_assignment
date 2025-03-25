package com.xworkz.assignment.innerpackage;

public class BankAccount {
    public int accountNumber=123456;
    private  double balance=5000.50;
    String branch="Chennai";

    public  void accountPublic(){
        System.out.println("Public method accessed: Bank Account Details");
    }
    void accountPackageLevel()
    {
        System.out.println("Package-level method accessed");
    }
}
