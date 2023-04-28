package com.ankush.Department.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//This is a normal pojo implementation
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Integer  salary;
    private String companyName;
}
