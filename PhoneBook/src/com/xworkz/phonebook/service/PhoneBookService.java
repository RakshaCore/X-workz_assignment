package com.xworkz.phonebook.service;

import com.xworkz.phonebook.dto.PhoneBookDTO;

public interface PhoneBookService
{
public String validateAndSave(PhoneBookDTO phoneBookDTO);

public PhoneBookDTO getById(int id);
}
