package com.xworkz.assignment.innerpackage;

public class ShoppingCartRunner {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();

        cart.cartPublic();
        cart.cartPackageLevel();

        System.out.println("Total items in cart: " + cart.itemCount);
        System.out.println("Applied discount code: " + cart.discountCode);
    }
}
