package com.xworkz.assignment.innerpackage;




public class ShoppingCart {
    public int itemCount =5;
    private double totalAmount=250.75;
    String discountCode="SAVE10";

    public void cartPublic(){
        System.out.println("Public method accessed: Shopping Cart Details");
    }
    private  void cartPrivate(){
        System.out.println("Private method accessed");
    }
    void cartPackageLevel(){
        System.out.println("Package-Level method accessed");
    }
}
