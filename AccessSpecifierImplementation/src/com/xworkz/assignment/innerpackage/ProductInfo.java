package com.xworkz.assignment.innerpackage;

public class ProductInfo {
    public String productName="Laptop";
    private  double price=999.99;
    String brand="Dell";

    public void productPublic()
    {
        System.out.println("Public method accessed: Product Details");
    }
    private void productPrivate() {
        System.out.println("Private method accessed");
    }
    void productPackageLevel() {
        System.out.println("Package-level method accessed");
    }
}
