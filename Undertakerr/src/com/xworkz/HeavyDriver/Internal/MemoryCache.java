package com.xworkz.HeavyDriver.Internal;

public class MemoryCache implements Cache {

    @Override
    public void cacheData() {
        System.out.println("Caching data in memory...");
    }

    @Override
    public void clearCache() {
        System.out.println("Clearing memory cache...");
    }

    @Override
    public void removeCachedData() {
        System.out.println("Removing cached data from memory...");
    }
}
