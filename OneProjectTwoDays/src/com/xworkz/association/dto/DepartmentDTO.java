package com.xworkz.association.dto;

import  lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class DepartmentDTO {
    private String name;
    private int numberOfStaff;
    private int numberOfStudents;
    private String description;

    private HODDTO hodDTO;
}
