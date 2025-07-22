package com.xworkz.association.dto;
import lombok.*;
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@ToString

public class PortfolioDTO {
    private String name;
    private String email;
    private String phoneNumber;
    private String skills;

    private DepartmentDTO departmentDTO;

}
