package com.skc.cb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skc.cb.dao.EmployeeDAO;
import com.skc.cb.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@GetMapping(value="/employees")
	public List<Employee> getEmployee() {
		return employeeDAO.getEmployee();
	}
}
