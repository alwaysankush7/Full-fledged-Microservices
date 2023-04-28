package com.ankush.Department.controller;

import com.ankush.Department.VO.ResponseTemplateVO;
import com.ankush.Department.entity.Department;
import com.ankush.Department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside saveDepartment of DepartmentController");
        return  departmentService.saveDepartment(department);
    }
    //We will create a method to get the department along with the employee which is belongs to the department

    @GetMapping("/{departmentId}")
    public ResponseTemplateVO getDepartmentWithEmployee(@PathVariable Integer departmentId){
        log.info("inside getDepartmentWithEmployee of DepartmentController");
        return departmentService.getDepartmentWithEmployee(departmentId);
    }

}
