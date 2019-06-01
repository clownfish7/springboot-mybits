package com.you.springboot.controller;

import com.you.springboot.bean.Department;
import com.you.springboot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author You
 * @create 2019-03-14 13:52
 */

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDepartment(Department department){
        departmentMapper.insertDept(department);
        return department;
    }
}
