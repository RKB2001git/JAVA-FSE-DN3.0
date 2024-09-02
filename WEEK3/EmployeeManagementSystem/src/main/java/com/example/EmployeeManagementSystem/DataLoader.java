package com.example.EmployeeManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        // Create and save employees
        Employee employee1 = new Employee("John Doe", "Engineering", 70000.0);
        Employee employee2 = new Employee("Jane Smith", "Marketing", 60000.0);

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
    }
}
