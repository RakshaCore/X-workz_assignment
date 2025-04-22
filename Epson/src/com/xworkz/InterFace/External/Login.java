package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Authentication;

public class Login {
    private Authentication authentication;
    public Login(Authentication authentication) {
        this.authentication = authentication;
        System.out.println("Running Login");
    }
    public void authenticate() {
        if (this.authentication != null) {
            this.authentication.login();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
