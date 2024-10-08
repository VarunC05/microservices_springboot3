package com.code.employee_server.controller;

import com.code.employee_server.model.Employee;
import com.code.employee_server.repository.EmployeeRepository;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping
    public Employee add(@RequestBody Employee department){
        return employeeRepository.addDepartment(department);
    }

    @GetMapping
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable Long departmentId){
        return employeeRepository.findByDepartment(departmentId);
    }

}
