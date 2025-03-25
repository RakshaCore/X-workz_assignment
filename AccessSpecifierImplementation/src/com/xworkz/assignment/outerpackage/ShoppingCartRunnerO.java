package com.xworkz.assignment.outerpackage;

import com.xworkz.assignment.innerpackage.ShoppingCart;

public class ShoppingCartRunnerO {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.cartPublic();

        System.out.println("Total items in cart: " + cart.itemCount);
    }
    }
