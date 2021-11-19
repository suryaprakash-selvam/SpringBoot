package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Login")
public class Login {

@Id
	private String UserName;
	private String Password;
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
	
	
	    
	    

public Login() {
	
}

public Login(String UserName,String Password) {
	
	this.UserName=UserName;
	this.Password=Password;
	
	
}

@Override
public String toString() {
    return "Login{" +
           
            ", UserName='" +UserName  + '\'' +
            ",Password ='" + Password + '\'' +
            
                   '}';
    
}
public void findByUserName(String string) {
	// TODO Auto-generated method stub
	
}

    
}    
    



