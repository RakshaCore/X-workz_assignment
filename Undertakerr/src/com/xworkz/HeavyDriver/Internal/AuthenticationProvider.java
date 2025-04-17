package com.xworkz.HeavyDriver.Internal;

public interface AuthenticationProvider {
    void authenticateUser();
    void authorizeUser();
    void logAuthenticationAttempt();
    default void logAuthentication() {
        System.out.println("Logging authentication...");
    }
}
