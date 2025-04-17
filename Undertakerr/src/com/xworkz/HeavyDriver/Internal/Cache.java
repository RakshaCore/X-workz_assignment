package com.xworkz.HeavyDriver.Internal;

public interface Cache {
    void cacheData();
    void clearCache();
    void removeCachedData();
    default void logCache() {
        System.out.println("Logging cache...");
    }
}
