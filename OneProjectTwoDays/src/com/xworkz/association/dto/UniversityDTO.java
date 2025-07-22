package com.xworkz.association.dto;

import lombok.*;

@AllArgsConstructor
@ToString
@Setter
@Getter
@NoArgsConstructor


public class UniversityDTO {
    private String name;
    private String location;
    private String type;
    private int establishedYear;
    private ChancellorDTO chancellorDTO;

}
