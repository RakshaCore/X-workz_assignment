package com.xworkz.association.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EducationDTO {
    private String nameOfDegree;
    private int durationInYears;
    private double percentage;
    private String universityName;

    private  UniversityDTO universityDTO;


}
