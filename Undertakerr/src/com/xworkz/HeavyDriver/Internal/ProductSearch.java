package com.xworkz.HeavyDriver.Internal;

public class ProductSearch implements SearchEngine {
    @Override
    public void search() {
        System.out.println("Searching for products...");
    }

    @Override
    public void index() {
        System.out.println("Indexing products...");
    }

    @Override
    public void delete() {
        System.out.println("Deleting product from index...");
    }
}
