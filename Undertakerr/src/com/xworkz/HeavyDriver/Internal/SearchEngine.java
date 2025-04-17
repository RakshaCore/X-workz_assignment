package com.xworkz.HeavyDriver.Internal;

public interface SearchEngine {
    void search();
    void index();
    void delete();
    default void logSearch() {
        System.out.println("Logging search...");
    }

}
