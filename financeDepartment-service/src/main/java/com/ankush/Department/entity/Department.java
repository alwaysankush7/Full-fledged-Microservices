package com.ankush.Department.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    private Integer employeeId;
}
