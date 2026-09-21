package com.yash.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.yash.entity.Address;
import com.yash.entity.Employee;
import com.yash.service.EmployeeService;

@Component
public class MyRunnerApp implements ApplicationRunner {
	
	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

/*
		// Case 1 : Save Employee
		Employee employee = Employee.builder()
							.empNo(2L)
							.empName("BBB")
							.salary(650000.0)
							.address(
								new Address("102", "Godswood", "Winterfell", "411000") 
							)
							.build();
		
		employee = employeeService.saveEmployee(employee);
		
		System.out.println("Employee Saved");

*/
		
/*
		
		// Case 2 : Find Employee By ID
		
		Employee emp = employeeService.fetchEmployeeById(1L);
		System.out.println("Employee Details : " + emp);
		
		System.out.println("------------------------------------------------------------");
		
		// Case 3 : Find All Employees
		
		for(Employee e : employeeService.fetchAllEmployee()) {
			
			System.out.println("Employee ID  : " + e.getEmpNo());
			System.out.println("Employee Name  : " + e.getEmpName());
			System.out.println("Employee Salary  : " + e.getSalary());
			System.out.println("Employee Address  : " + e.getAddress());
		}	
*/
		
		employeeService.deleteEmployee(1L);
		
		System.out.println("Done");
		
	}

}















