package com.jsp.SpringbootCRUD.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.SpringbootCRUD.Repository.EmployeeRepository;
import com.jsp.SpringbootCRUD.dto.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> gellAllEmployee() {
		return employeeRepository.findAll();
	}

	public Employee getemployeeById(int id) {
		Optional<Employee> eOptional = employeeRepository.findById(id);
		return eOptional.get();
	}

	public Employee deleteEmployeeById(int id) {
		Optional<Employee> optional=employeeRepository.findById(id);
		if (optional.get()!=null) {
			 employeeRepository.delete(optional.get());
		}
		
		return optional.get();
	}

	public Employee updateEmployee(Employee employee) {
		Optional<Employee> optional=employeeRepository.findById(employee.getId());
		if (optional.get()!=null) {
			return employeeRepository.save(employee);
		}
	
			return null;
	}
}
