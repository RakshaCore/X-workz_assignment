package com.xworkz.stepone.service;

import com.xworkz.stepone.dto.UserDTO;

import java.util.Objects;

public class SignUpServiceImpl implements SignUpService {

    @Override
    public String validateAndSave(UserDTO userDTO) {
        if(userDTO == null) {
            return "UserDTO cannot be null";
        }

        String email = userDTO.getEmail();
        String userName = userDTO.getUserName();
        String password = userDTO.getPassword();
        String confirmPassword = userDTO.getConfirmPassword();
       if(email == null || email.isEmpty()) {
            return "Email cannot be empty";
        }
        if(userName == null || userName.isEmpty()) {
            return "Username cannot be empty";
        }
        if(password == null || password.isEmpty()) {
            return "Password cannot be empty";
        }
        if(confirmPassword == null || confirmPassword.isEmpty()) {
            return "Confirm Password cannot be empty";
        }
        if(!Objects.equals(password, confirmPassword)) {
            return "Password and Confirm Password do not match";
        }
        return "User registered successfully with email: " + email;
    }
}
