package com.employee.app.controller;

import com.employee.app.entity.Employee;
import com.employee.app.exception.EmployeeException;
import com.employee.app.service.EmployeeService;
import com.employee.app.service.EmployeeServiceImpl;

public class EmployeeDriver {

	public static void main(String[] args) {

	EmployeeService employeeService = new EmployeeServiceImpl();
		
	try {
		Employee emp = employeeService.registerEmployee(new Employee(1, "emp 1", 100.0));
		System.out.println("Employee Created SuccessFully");
		System.out.println(emp);
	} catch (EmployeeException e) {
		System.out.println(e.getMessage());
	}
	
	try {
		employeeService.updateEmployee(new Employee(101, "emp 101", 10100.0));
	} catch (EmployeeException e) {
		System.out.println(e.getMessage());
	}
	
	}

}
