package com.xworkz.adoption.repository;

import com.xworkz.adoption.dto.AdoptionDTO;

public interface AdoptionRepository {
    public String save(AdoptionDTO adoptionDTO);

    AdoptionDTO getDetails(int id);

}
