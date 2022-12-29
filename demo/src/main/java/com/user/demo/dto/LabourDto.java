package com.user.demo.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class LabourDto {

	@Id
	@GeneratedValue
	private int lId;
  
	private String labourName;
	//@Min(10)
	 
	private String mobileNo;
	
	 
	private String workCategory;
	
	 
	private String workExperience;
	
	 
	private String location;
	 
	
	private String emai;


	 


	public int getlId() {
		return lId;
	}


	public void setlId(int lId) {
		this.lId = lId;
	}


	public String getLabourName() {
		return labourName;
	}


	public void setLabourName(String labourName) {
		this.labourName = labourName;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getWorkCategory() {
		return workCategory;
	}


	public void setWorkCategory(String workCategory) {
		this.workCategory = workCategory;
	}


	public String getWorkExperience() {
		return workExperience;
	}


	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getEmai() {
		return emai;
	}


	public void setEmai(String emai) {
		this.emai = emai;
	}
	 
	
	
}
