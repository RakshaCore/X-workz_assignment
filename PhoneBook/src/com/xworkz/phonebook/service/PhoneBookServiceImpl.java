package com.xworkz.phonebook.service;

import com.xworkz.phonebook.dto.PhoneBookDTO;
import com.xworkz.phonebook.repository.PhoneBookRepository;
import com.xworkz.phonebook.repository.PhoneBookRepositoryImpl;

public class PhoneBookServiceImpl implements PhoneBookService{
    @Override
    public String validateAndSave(PhoneBookDTO phoneBookDTO) {

        System.out.println("Validating the dataaa");
        if(phoneBookDTO!=null) {
            String name = phoneBookDTO.getFullName();
            String phoneNumber = phoneBookDTO.getPhoneNumber();
            String email = phoneBookDTO.getEmail();
            if (name==null||name.length()<4||name.length()>50)
            {
                System.out.println("Name is invalid");
                return "Please enter a valid name!!";
            }
            System.out.println("Validatinggg");
            if (phoneNumber == null || phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
                System.out.println("Phone number is invalid");
                return "Please enter a valid phone number!!";
            }
            if(email == null || !email.contains("@") || !email.contains(".")) {
                System.out.println("Email is invalid");
                return "Please enter a valid email address!!";
            }

            PhoneBookRepository phoneBookRepository = new PhoneBookRepositoryImpl();
            phoneBookRepository.save(phoneBookDTO);

        }
        return "Form submitted";

    }

    @Override
    public PhoneBookDTO getById(int id) {

        if (id <= 0) {
            System.out.println("Invalid ID");
            return null;
        }
        return null;
    }
}
