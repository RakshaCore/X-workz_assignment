package com.xworkz.afterYudagi.Internal;

public class OnlineTaxFiling extends TaxFiling{
    public OnlineTaxFiling() {
        System.out.println("Online Tax Filing System Activated");
    }
    @Override
    public void collectTaxDetails() {
        System.out.println("Collecting tax details from user");
    }
    @Override
    public void calculateTax() {
        System.out.println("Calculating payable tax amount");
    }
    @Override
    public void generateTaxReport() {
        System.out.println("Generating tax report for the user");
    }
    @Override
    public void processPayment() {
        System.out.println("Processing tax payment");
    }
    @Override
    public void fileReturn() {
        System.out.println("Filing tax return online");
    }
}
