package com.ankush.Department.service;

import ch.qos.logback.classic.spi.TurboFilterList;
import com.ankush.Department.VO.Employee;
import com.ankush.Department.VO.ResponseTemplateVO;
import com.ankush.Department.entity.Department;
import com.ankush.Department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private RestTemplate restTemplate;
    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public ResponseTemplateVO getDepartmentWithEmployee(Integer departmentId) {
        log.info("inside getDepartmentWithEmployee of DepartmentService");
        ResponseTemplateVO response = new ResponseTemplateVO();
        Department department = departmentRepository.findByDepartmentId(departmentId);

        Employee employee = restTemplate.getForObject("http://EMPLOYEE-SERVICE/api/employeeService/employee/"+department.getDepartmentId(),Employee.class);
        response.setDepartment(department);
        response.setEmployee(employee);
        return response;
    }
}
