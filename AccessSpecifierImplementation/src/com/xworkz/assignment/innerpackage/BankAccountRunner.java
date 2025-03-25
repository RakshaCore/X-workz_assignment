package com.xworkz.assignment.innerpackage;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();

        account.accountPublic();
        account.accountPackageLevel();

        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Bank Branch: " + account.branch);
    }
}
