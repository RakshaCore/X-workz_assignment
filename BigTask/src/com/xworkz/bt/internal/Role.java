package com.xworkz.bt.internal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
@Getter
public class Role {
    private String roleName;
    private String roleDescription;
    private String department;
    private String requirements;

    private List<Criteria> criteriaList;

}
