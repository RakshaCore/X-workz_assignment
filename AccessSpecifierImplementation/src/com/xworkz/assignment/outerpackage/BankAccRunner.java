package com.xworkz.assignment.outerpackage;
import com.xworkz.assignment.innerpackage.BankAccount;
public class BankAccRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.accountPublic();

        System.out.println("Account Number: " + account.accountNumber);
        //System.out.println("Bank Branch: " + account.branch);
    }
}
