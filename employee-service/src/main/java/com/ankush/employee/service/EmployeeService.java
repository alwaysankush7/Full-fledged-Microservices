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
        this shouldbe the retuerr how would be   sure about this is this the way whta you we are doing the planning the way we are thinking this problem we should know this aat all what we are thinking is this the way where we can begin the things in a proper way so that we can think thr amount where wae should we do the task so that we can emerge in yhe way where we are thinking the plan and sharing the way we are and we need to know the policy n statement of findbyemploy
        return employeeRepository.findEmployeeByEmployeeId(employeeId); but i need to work hard to get what i was thinking in my life
    }
}
