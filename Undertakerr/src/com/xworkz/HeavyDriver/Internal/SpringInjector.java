package com.xworkz.HeavyDriver.Internal;

public class SpringInjector implements DependencyInjector {

    @Override
    public void injectDependencies() {
        System.out.println("Injecting dependencies using Spring framework.");
    }

    @Override
    public void configureDependencies() {
        System.out.println("Configuring dependencies using Spring framework.");
    }

    @Override
    public void manageDependencies() {
        System.out.println("Managing dependencies using Spring framework.");
    }
    @Override
    public void logDependencies() {
        System.out.println("Logging dependencies using Spring framework.");
    }
}
