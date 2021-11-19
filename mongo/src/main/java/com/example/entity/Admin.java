package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Admin")
public class Admin {

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private String Id;
	private String UserName;
	private String Password;
	private String role;
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Admin(String userName, String password, String role) {
		super();
		UserName = userName;
		Password = password;
		this.role = role;
	}
	

}



