package com.ust.employeeRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.employeeRegistration.model.Employee;
import com.ust.employeeRegistration.repositry.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;

	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	public Employee getById(int empid) {
		// TODO Auto-generated method stub
		return empRepo.findById(empid).orElse(null);
	}

	public Employee updateEmployee(Employee emp) {
		 Employee employee=new Employee();
		 
		 Optional<Employee>updateemp=empRepo.findById(emp.getEmpid());
		 if(updateemp.isPresent()) {
			 employee.setEmpid(emp.getEmpid());
		 employee.setDomain(emp.getDomain());
		 employee.setEmpName(emp.getEmpName());
		 employee.setEmailId(emp.getEmailId());
		 employee.setLocation(emp.getLocation());
		 employee.setExperience(emp.getExperience());
		 }else {
			 return new Employee();
		 }
		return empRepo.save(emp);
		//return employee;
	}

	public String deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		  empRepo.deleteById(empid);
		  return "employee deleted successfully";
	}

}
