package com.example.EmployeeManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Find employees by department with pagination and sorting
    Page<Employee> findByDepartment(String department, Pageable pageable);

    // Find employees with name containing a specific string with pagination and sorting
    Page<Employee> findByNameContaining(String name, Pageable pageable);

    // Find employees with salary greater than the specified amount with pagination and sorting
    Page<Employee> findBySalaryGreaterThan(Double salary, Pageable pageable);
}
