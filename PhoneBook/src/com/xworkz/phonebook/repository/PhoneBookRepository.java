package com.xworkz.phonebook.repository;

import com.xworkz.phonebook.dto.PhoneBookDTO;

public interface PhoneBookRepository {
    public String save(PhoneBookDTO phoneBookDTO);
    PhoneBookDTO getDetails(int id);
}
