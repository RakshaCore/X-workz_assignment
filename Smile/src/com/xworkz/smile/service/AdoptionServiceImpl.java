package com.xworkz.smile.service;

import com.xworkz.smile.dto.AdoptionDTO;
import com.xworkz.smile.repository.AdoptionRepository;
import com.xworkz.smile.repository.AdoptionRepositoryImpl;

public class AdoptionServiceImpl implements AdoptionService {

    private AdoptionRepository repository = new AdoptionRepositoryImpl();

    @Override
    public boolean validateAndSave(AdoptionDTO dto) {
        if (dto.getAdopterName() == null || dto.getAdopterName().isEmpty()) return false;
        if (dto.getChildName() == null || dto.getChildName().isEmpty()) return false;
        return repository.save(dto);
    }
}
