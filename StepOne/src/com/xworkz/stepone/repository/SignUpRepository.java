package com.xworkz.stepone.repository;

import com.xworkz.stepone.dto.UserDTO;

public interface SignUpRepository {
    void save(UserDTO userDTO);
}
