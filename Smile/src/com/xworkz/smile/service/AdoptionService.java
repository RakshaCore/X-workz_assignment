package com.xworkz.smile.service;

import com.xworkz.smile.dto.AdoptionDTO;

public interface AdoptionService {
    boolean validateAndSave(AdoptionDTO dto);
}
