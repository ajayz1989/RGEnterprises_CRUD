package com.rg.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class UserDetail {

	@NotEmpty(message = "*Please provide an UserName")
	private String username;
	@NotEmpty(message = "*Please provide your Password")
	private String password;
	
	
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
}
