package com.xworkz.scholarship.service;


import com.xworkz.scholarship.dto.ScholarshipDTO;
import com.xworkz.scholarship.repository.ScholarshipRepository;

public class ScholarshipServiceImpl implements ScholarshipService {

    @Override
    public String validateAndSave(ScholarshipDTO scholarshipDTO) {
        if (scholarshipDTO == null) {
            return "Scholarship details cannot be null";
        }
        if (scholarshipDTO.getName() == null || scholarshipDTO.getName().isEmpty()) {
            return "Scholarship name cannot be empty";
        }
        if (scholarshipDTO.getAmount() <= 0) {
            return "Scholarship amount must be greater than zero";
        }
        // Assuming repository is injected and available
        return repository.save(scholarshipDTO);
    }
}
