package com.xworkz.stepone.service;

import com.xworkz.stepone.dto.UserDTO;

public interface SignInService {
    String validateAndSave(UserDTO userDTO);

}
