package com.xworkz.association.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString

public class StaffDTO {
    private String name;
    private String salary;
    private String designation;
    private String department;

    private  DetailDTO detailDTO;
}
