package com.java.springboot.productproject.entity;


import org.hibernate.annotations.AnyDiscriminator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;


@Entity
@Table(name = "users")

public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int userId;
	private String userEmail;
	private String userPassword;
	
	@Min(value = 6000000000l ,message = "phone no is invalis should be greater then 6000000000l")
	@Max(value = 9000000000l,message = "phone no is invalis should be less then 9000000000l")
	
	private long phoneNo;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


}
