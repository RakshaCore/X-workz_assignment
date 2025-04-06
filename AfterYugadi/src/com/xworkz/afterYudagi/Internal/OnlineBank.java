package com.xworkz.afterYudagi.Internal;

public class OnlineBank extends  Bank{
    public OnlineBank() {
        System.out.println("OnlineBank Constructor");
    }
@Override
    public void openAccount() {
        System.out.println("Bank is opening an account");
    }
@Override
    public void provideLoan() {
        System.out.println("Bank is providing a loan");
    }
@Override
    public void processTransactions() {
        System.out.println("Bank is processing transactions");
    }
@Override
    public void issueCards() {
        System.out.println("Bank is issuing debit/credit cards");
    }
@Override
    public void manageOnlineBanking() {
        System.out.println("Bank is managing online banking");
    }
}
