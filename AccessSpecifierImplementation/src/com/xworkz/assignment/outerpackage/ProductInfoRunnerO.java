package com.xworkz.assignment.outerpackage;
import com.xworkz.assignment.innerpackage.ProductInfo;

public class ProductInfoRunnerO {
    public static void main(String[] args) {
        ProductInfo product = new ProductInfo();

        product.productPublic();

        System.out.println("Product Name: " + product.productName);

    }
}
