package com.xworkz.association.dto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor

public class HODDTO {
    private String name;
    private int experienceInYears;
    private String department;
    private String email;

    private List<StaffDTO> staffDTOs;
}
