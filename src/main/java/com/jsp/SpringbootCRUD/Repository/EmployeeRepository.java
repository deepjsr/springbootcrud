package com.jsp.SpringbootCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringbootCRUD.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
