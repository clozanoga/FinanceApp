package com.clozanoga.financeapp.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class UserDTO {
	
	@NotBlank(message = "You must enter an username")
	@Email(message="Not a valid email address")
	private String username;
	@NotBlank(message = "You must enter a valid password")
	@Length(min = 6, message = "Password length must be at least 6 characters")
	private String password;
	@Length(min = 6, message = "Password length must be at least 6 characters")
	private String confirmPassword;
	@NotBlank(message = "You must enter your name")
	private String fullName;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
