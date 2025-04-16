package com.xworkz.HeavyDriver.Internal;

public interface AuthenticationProvider {
    void authenticateUser();
    void authorizeUser();
    void logAuthenticationAttempt();
}
