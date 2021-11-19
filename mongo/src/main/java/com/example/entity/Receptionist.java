package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = " Receptionist")
public class Receptionist {
	
    @Id
	private String id;
	private String FirstName;
	private String LastName;
	private String mobileNo;
	private String Date;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
public  Receptionist() {
	
}


public  Receptionist(String firstName, String lastName,String date, String mobileNo) {
	this.FirstName=firstName;
	this.LastName=lastName;
	this.mobileNo=mobileNo;
	this.Date = date;
	
}

@Override
public String toString() {
    return "Doctor{" +
            
            ", firstName='" + FirstName + '\'' +
            ", lastName='" + LastName + '\'' +
             
              ", mobileNo='" + mobileNo + '\'' +
              
                  ", date='" + Date + '\'' +
                  
                   '}';
}
}