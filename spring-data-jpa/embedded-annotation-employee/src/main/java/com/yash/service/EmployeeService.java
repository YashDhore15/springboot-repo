package com.yash.service;

import java.util.List;

import com.yash.entity.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	public Employee fetchEmployeeById(Long id);
	public List<Employee> fetchAllEmployee();
	public void deleteEmployee(Long id);
}
