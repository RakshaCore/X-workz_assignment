package com.xworkz.association.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class DetailDTO {


    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    private EducationDTO educationDTO;

}
