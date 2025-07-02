package com.xworkz.stepone.service;

import com.xworkz.stepone.dto.UserDTO;

public interface SignUpService {
    String validateAndSave(UserDTO userDTO);
}
