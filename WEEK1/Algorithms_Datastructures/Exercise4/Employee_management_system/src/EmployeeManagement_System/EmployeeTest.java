package EmployeeManagement_System;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create an EmployeeManager instance with a capacity of 5 employees
		        EmployeeManager manager = new EmployeeManager(5);

		        // Create some Employee instances
		        Employee emp1 = new Employee(1, "Alice Smith", "Manager", 75000);
		        Employee emp2 = new Employee(2, "Bob Jones", "Developer", 60000);
		        Employee emp3 = new Employee(3, "Charlie Brown", "Analyst", 55000);

		        // Add employees to the manager
		        manager.addEmployee(emp1);
		        manager.addEmployee(emp2);
		        manager.addEmployee(emp3);

		        // Display all employees
		        System.out.println("All Employees:");
		        manager.traverseEmployees();

		        // Search for an employee
		        System.out.println("\nSearching for employee with ID 2:");
		        Employee foundEmployee = manager.searchEmployee(2);
		        if (foundEmployee != null) {
		            System.out.println(foundEmployee);
		        } else {
		            System.out.println("Employee not found.");
		        }

		        // Delete an employee
		        System.out.println("\nDeleting employee with ID 2:");
		        boolean deleted = manager.deleteEmployee(2);
		        if (deleted) {
		            System.out.println("Employee deleted successfully.");
		        } else {
		            System.out.println("Employee not found.");
		        }

		        // Display all employees after deletion
		        System.out.println("\nAll Employees after deletion:");
		        manager.traverseEmployees();
		    }

}
