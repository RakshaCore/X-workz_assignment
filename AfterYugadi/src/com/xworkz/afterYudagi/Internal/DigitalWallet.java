package com.xworkz.afterYudagi.Internal;

public class DigitalWallet extends Wallet{
    public DigitalWallet() {
        System.out.println("Digital Wallet System Activated");
    }
@Override
    public void addMoney() {
        System.out.println("Adding money to the wallet");
    }
@Override
    public void makePayment() {
        System.out.println("Making payment using wallet balance");
    }
@Override
    public void checkBalance() {
        System.out.println("Checking wallet balance");
    }
@Override
    public void viewTransactionHistory() {
        System.out.println("Viewing wallet transaction history");
    }
@Override
    public void applyDiscounts() {
        System.out.println("Applying discounts on wallet payments");
    }
}
