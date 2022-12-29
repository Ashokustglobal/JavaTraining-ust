package com.labour.labourDetails.model;

import org.hibernate.validator.constraints.Email;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "Labour")
public class Labour {

	@Id
	@GeneratedValue
	private int lId;
	@NotNull(message = "name shoud not be null")
	private String labourName;
	//@Min(10)
	@Pattern(regexp = "^\\d{10}$")
	private String mobileNo;
	
	@NotBlank(message = "Work Category shouldnot blank")
	private String workCategory;
	
	@NotBlank(message = "Work experience shouldnot blank")
	private String workExperience;
	
	// @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$")
	private String location;
	@jakarta.validation.constraints.Email(message = "invalid email address")
	
	private String emai;
	@NotNull(message = "must add pan number")
	 
	private String panNumber;
	 
public Labour() {
	
}
	
	public Labour(int lId, String labourName, @Max(10) String mobileNo, String workCategory, String workExperience,
			String location,   String emai, String panNumber) {
		//super();
		this.lId = lId;
		this.labourName = labourName;
		this.mobileNo = mobileNo;
		this.workCategory = workCategory;
		this.workExperience = workExperience;
		this.location = location;
		this.emai = emai;
		this.panNumber = panNumber;
	}
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
	public String getEmai() {
		return emai;
	}
	public void setEmai(String emai) {
		this.emai = emai;
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
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	
	
	
}
