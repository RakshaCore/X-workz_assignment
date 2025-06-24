package com.xworkz.adoption.service;

import com.xworkz.adoption.dto.AdoptionDTO;

public interface AdoptionService {
    public String validateAndSave(AdoptionDTO adoptionDTO);

     AdoptionDTO getById(int id);
}

