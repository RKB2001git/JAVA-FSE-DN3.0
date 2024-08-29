package EmployeeManagement_System;

public class EmployeeManager {

	    private Employee[] employees;
	    private int count;

	    // Constructor
	    public EmployeeManager(int size) {
	        employees = new Employee[size];
	        count = 0;
	    }

	    // Method to add an employee
	    public void addEmployee(Employee employee) {
	        if (count < employees.length) {
	            employees[count++] = employee;
	        } else {
	            System.out.println("Array is full. Cannot add more employees.");
	        }
	    }

	    // Method to search for an employee by ID
	    public Employee searchEmployee(int employeeId) {
	        for (int i = 0; i < count; i++) {
	            if (employees[i].getEmployeeId() == employeeId) {
	                return employees[i];
	            }
	        }
	        return null; // Employee not found
	    }

	    // Method to traverse and display all employees
	    public void traverseEmployees() {
	        for (int i = 0; i < count; i++) {
	            System.out.println(employees[i]);
	        }
	    }

	    // Method to delete an employee by ID
	    public boolean deleteEmployee(int employeeId) {
	        for (int i = 0; i < count; i++) {
	            if (employees[i].getEmployeeId() == employeeId) {
	                for (int j = i; j < count - 1; j++) {
	                    employees[j] = employees[j + 1];
	                }
	                employees[--count] = null; // Clear last element
	                return true; // Successfully deleted
	            }
	        }
	        return false; // Employee not found
	    }

}
