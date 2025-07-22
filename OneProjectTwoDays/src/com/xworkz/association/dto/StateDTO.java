package com.xworkz.association.dto;
import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class StateDTO {
    private String name;
    private String chiefMinister;
    private String governor;
    private String area;
    private List<MinisterDTO> ministerDTOS;

}
