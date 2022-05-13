package com.java.springboot.service;

import java.util.List;

import com.java.springboot.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
Employee getEmployeeById(long id);
void deleteEmployeeById(long id);

}
