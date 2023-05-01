package com.jsp.SpringbootCRUD.service;

import com.jsp.SpringbootCRUD.dto.Employee;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.jsp.SpringbootCRUD.Repository.EmployeeRepository;



import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTests {
	@Autowired
	EmployeService employeService;
	@Autowired
	EmployeeRepository employeeRepository;

	@ParameterizedTest
	@ArgumentsSource(EmployeeArgumentsProvider.class)
	public void testSaveNewEmployee(Employee employee) {
		if (employee.getName() != null) assertTrue(employeService.saveEmployee(employee)); // Should pass
		else {
			assertThrows(Exception.class, () -> employeService.saveEmployee(employee)); // Should fail
		}
	}


}
