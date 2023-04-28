package com.ankush.employee.controller;

import com.ankush.employee.entity.Employee;
import com.ankush.employee.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employeeService/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee) {
        log.info("inside saveEmployee method of EmployeeController");
        return  employeeService.saveEmployee(employee);
    }
    @GetMapping("/{employeeId}")
    public  Employee findEmployeeByEmployeeId(@PathVariable("employeeId") Integer employeeId) {
        log.info("inside findEmployeeByEmployeeId method of EmployeeController");
        return employeeService.findEmployeeByEmployeeId(employeeId);
    }

}
