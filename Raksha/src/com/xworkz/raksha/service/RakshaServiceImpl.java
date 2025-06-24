package com.xworkz.raksha.service;

import com.xworkz.raksha.dto.RakshaDTO;
import com.xworkz.raksha.repository.RakshaRepository;
import com.xworkz.raksha.repository.RakshaRepositoryImpl;

public class RakshaServiceImpl implements RakshaService{
    @Override
    public String validateAndSave(RakshaDTO rakshaDTO) {
        if(rakshaDTO!=null)
        {
            RakshaRepository rakshaRepository=new RakshaRepositoryImpl();
            rakshaRepository.save(rakshaDTO);
        }
        return "false";
    }
}
