package com.xworkz.HeavyDriver.Internal;

public interface DependencyInjector {
    void injectDependencies();

    void configureDependencies();

    void manageDependencies();

    default void logDependencies() {
        System.out.println("Logging dependencies...");
    }
}
