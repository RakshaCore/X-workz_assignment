package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Discount;

public class ShoppingCart {
    private Discount discount;
    public ShoppingCart(Discount discount) {
        this.discount = discount;
        System.out.println("Running ShoppingCart");
    }
    public void applyDiscount() {
        if (this.discount != null) {
            this.discount.applyDiscount();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
