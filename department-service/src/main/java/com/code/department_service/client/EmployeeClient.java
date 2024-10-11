package com.code.department_service.client;

import com.code.department_service.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/employee/departments/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable Long departmentId);
}

