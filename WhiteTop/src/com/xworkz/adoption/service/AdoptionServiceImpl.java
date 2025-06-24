package com.xworkz.adoption.service;

import com.xworkz.adoption.dto.AdoptionDTO;
import com.xworkz.adoption.repository.AdoptionRepository;
import com.xworkz.adoption.repository.AdoptionRepositoryImpl;

public class AdoptionServiceImpl implements AdoptionService{
    @Override
    public AdoptionDTO getById(int id)
    {
        if (id<=0)
        {
            System.out.println("Invalid ID");
        }


            return null;
    }

    @Override
    public String validateAndSave(AdoptionDTO adoptionDTO) {

        System.out.println("Validating the dataaa");
        if(adoptionDTO!=null) {
            String name = adoptionDTO.getFirstName();
            if (name==null||name.length()<4||name.length()>30)
            {
                System.out.println("Name is invalid");
                return "Please enter a valid name!!";
            }
            System.out.println("Validatinggg");
            AdoptionRepository adoptionRepository=new AdoptionRepositoryImpl();
            adoptionRepository.save(adoptionDTO);
        }
        return "Form submitted";
    }
}
