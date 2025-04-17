package com.xworkz.HeavyDriver.Internal;

public class OAuthLogin implements AuthenticationProvider {
    @Override
    public void authenticateUser() {
        System.out.println("Authenticating user using OAuth...");
    }

    @Override
    public void authorizeUser() {
        System.out.println("Authorizing user using OAuth...");
    }

    @Override
    public void logAuthenticationAttempt() {
        System.out.println("Logging authentication attempt using OAuth...");
    }
    @Override
    public void logAuthentication() {
        System.out.println("Logging OAuth authentication...");
    }
}
