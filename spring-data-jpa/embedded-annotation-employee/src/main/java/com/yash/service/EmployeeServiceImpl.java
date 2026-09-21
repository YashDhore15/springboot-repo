package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entity.Employee;
import com.yash.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public Employee fetchEmployeeById(Long id) {
		
		return employeeRepository.findById(id).orElseThrow(
					() -> new RuntimeException("Employee Not Found!"));
	}

	@Override
	public List<Employee> fetchAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(Long id) {
		
		Employee employee = fetchEmployeeById(id);
		employeeRepository.delete(employee);
	}

}
