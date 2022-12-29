package com.user.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String mobileNo;
	private String address;
	private String email;
	private String aadharNo;
	
	public User() {
		
	}
	public User(int userId, String userName, String mobileNo, String address, String email, String aadharNo) {
		//super();
		this.userId = userId;
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.address = address;
		this.email = email;
		this.aadharNo = aadharNo;
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
