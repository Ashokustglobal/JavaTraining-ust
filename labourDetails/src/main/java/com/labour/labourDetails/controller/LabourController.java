package com.labour.labourDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.labour.labourDetails.exceptions.PersonNotFoundException;
import com.labour.labourDetails.model.Labour;
import com.labour.labourDetails.service.LabourService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1")
public class LabourController {
	
	@Autowired
	private LabourService labourService;

	@PostMapping("/register")
	public ResponseEntity<Labour> addEmployee(  @RequestBody @Valid Labour labour) throws PersonNotFoundException{
		
		labourService.addLabour(labour);
		return new ResponseEntity<>(labour,HttpStatus.CREATED);
	}
	
	@GetMapping("/exists/{labourName}")
	public ResponseEntity<Boolean> getLabourByName(@PathVariable String labourName) throws PersonNotFoundException{
		Boolean list=labourService.getbyName(labourName);
		if(list==false) {
			throw new PersonNotFoundException();
		}
		return new ResponseEntity<Boolean>(list,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/work/{workCategory}")
	public ResponseEntity<Boolean> getlistByWork(@RequestParam String workCategory) throws PersonNotFoundException{
		Boolean list1=labourService.getNameByWork(workCategory);
		if(list1==false) {
			throw new PersonNotFoundException();
		}
		return new ResponseEntity<Boolean>(list1,HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/update/labour")
	public Labour updateEmployees(@RequestBody Labour lap ) {
		return labourService.updateLabourDetails(lap);
	}
	
	@GetMapping("{lId}")
	public Labour getEmployeesById(@PathVariable("lId") int labourId ) {
		 Labour labour= labourService.getById(labourId );
		 return labour;
	}
}
