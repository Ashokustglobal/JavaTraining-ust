package com.ust.employeeRegistration.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.employeeRegistration.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	Optional<Employee> findById(int empid);

}
