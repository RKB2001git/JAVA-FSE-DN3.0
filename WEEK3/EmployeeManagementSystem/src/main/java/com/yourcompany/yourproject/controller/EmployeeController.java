package com.yourcompany.yourproject.controller;

import com.example.EmployeeManagementSystem.Employee;
import com.example.EmployeeManagementSystem.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public Page<Employee> getEmployees(
            @RequestParam(value = "department", required = false) String department,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "salary", required = false) Double salary,
            Pageable pageable) {

        if (department != null) {
            return employeeRepository.findByDepartment(department, pageable);
        } else if (name != null) {
            return employeeRepository.findByNameContaining(name, pageable);
        } else if (salary != null) {
            return employeeRepository.findBySalaryGreaterThan(salary, pageable);
        } else {
            return employeeRepository.findAll(pageable);
        }
    }
}
