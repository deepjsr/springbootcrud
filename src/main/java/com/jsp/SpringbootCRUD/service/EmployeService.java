package com.jsp.SpringbootCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.SpringbootCRUD.dao.EmployeeDao;
import com.jsp.SpringbootCRUD.dto.Employee;

@Service
public class EmployeService {
	@Autowired
	EmployeeDao employeeDao;
	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}
	public List<Employee> getAllEmployee(){
		return employeeDao.gellAllEmployee();
	}
	public Employee getallemployeeById(int id) {
		return employeeDao.getemployeeById(id);
	}
	public Employee deleteEmployeeById(int id) {
		return employeeDao.deleteEmployeeById(id);
	}
	public Employee updateEmployeeById(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}
}
