package com.xworkz.association.dto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryDTO {
    private String name;
    private String capital;
    private String president;
    private String population;

    private List<StateDTO> stateDTOS;

}
