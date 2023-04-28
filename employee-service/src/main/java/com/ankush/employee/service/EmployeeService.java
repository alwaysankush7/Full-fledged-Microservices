package com.ankush.employee.service;

import com.ankush.employee.entity.Employee;
import com.ankush.employee.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService {
    @Autowired
     private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        log.info("inside saveEmployee method of EmployeeService");
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeByEmployeeId(Integer employeeId) {
        log.info("inside findEmployeeByEmployeeId method of EmployeeService");
        return employeeRepository.findEmployeeByEmployeeId(employeeId);
    }
}
