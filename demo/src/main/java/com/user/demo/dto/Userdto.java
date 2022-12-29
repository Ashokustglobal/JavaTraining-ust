package com.user.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "UserDetails")
public class Userdto {
   
	@Id
	@GeneratedValue
	private int userId;
	@NotNull(message = "name shoud not be null")
	private String userName;
	@Pattern(regexp = "^\\d{10}$")
	private String mobileNo;
	@NotBlank(message = "Address is mandatoery")
	private String address;
	
	@Email(message = "Email must")
	private String email;
	@Size(min = 12,message = "not less then 12 digits")
	private String aadharNo;
	
	private String labourId;
	
	 
	
	public String getLabourId() {
		return labourId;
	}
	public void setLabourId(String labourId) {
		this.labourId = labourId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	 
	
}
