package com.xworkz.HeavyDriver.Internal;

public class GooogleSite implements Website {

    @Override
    public void load() {
        System.out.println("Loading Google site...");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing Google site...");
    }

    @Override
    public void close() {
        System.out.println("Closing Google site...");
    }
    @Override
    public void bookmark() {
        System.out.println("Bookmarking Google site...");
    }


}
