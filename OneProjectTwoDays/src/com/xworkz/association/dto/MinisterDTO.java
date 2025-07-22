package com.xworkz.association.dto;
import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MinisterDTO {
    private String name;
    private String party;
    private String state;
    private String designation;

    private List<PortfolioDTO> portfolios;

}
