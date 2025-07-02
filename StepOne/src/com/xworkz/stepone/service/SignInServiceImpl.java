package com.xworkz.stepone.service;

public class SignInServiceImpl
{
    String findCredentials(String userName, String password) {
        if(!userName.equals("null") && !password.equals("null")){
            Sign signinRepository=new SigninRepositoryImpl();
            SignUpDto signUpDto=signinRepository.findCredentials(userID,password);
            if(signUpDto!=null){
                if(userID.equals(signUpDto.getUserId()) && password.equals(signUpDto.getPassword())){
                    return "valid credentials";
                }
            }
            else return "Credentials not found";
        }
        return "Credentials are Empty";
    }
    }

}
