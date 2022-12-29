package com.ust.employeeRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.employeeRegistration.model.Employee;
import com.ust.employeeRegistration.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

	@Autowired
	private  EmployeeService empService;
	
	
	@PostMapping("/register")
	public Employee addEmployee(@RequestBody Employee emp) {
		return empService.createEmployee(emp);
	}
	
	@GetMapping("/ustemployee")
	public List<Employee> getAllEmployees( ) {
		return empService.getEmployees( );
	}
	
	@GetMapping("/ust/employee/{empid}")
	public Employee getEmployeesById(@PathVariable int empid ) {
		return empService.getById(empid );
	}
	@PutMapping("/update/employee")
	public Employee updateEmployees(@RequestBody Employee emp ) {
		return empService.updateEmployee(emp);
	}
	
	@DeleteMapping("/delete/employee")
	public String deleteEmployees(@PathVariable int empid) {
		return empService.deleteEmployee(empid);
	}
	
	
	
}
