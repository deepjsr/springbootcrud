package com.jsp.SpringbootCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringbootCRUD.dto.Employee;
import com.jsp.SpringbootCRUD.service.EmployeService;


@RestController
public class EmployeeController {
	@Autowired
	EmployeService employeService;
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeService.saveEmployee(employee);
	}
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeService.getAllEmployee();
	}
	@GetMapping("/employee/{id}")
	public Employee getAllEmployeeBYId(@PathVariable int id) {
		return employeService.getallemployeeById(id);
	}
	@DeleteMapping("employee/{id}")
	public Employee deleteEmployeeById(@PathVariable int id) {
		return employeService.deleteEmployeeById(id);
	}
	@PutMapping("employee/{id}")
	public Employee updateEmployee(@PathVariable Employee employee)
	{
		return employeService.updateEmployeeById(employee);
	}
}
