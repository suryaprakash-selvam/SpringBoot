package com.example.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Doctor")
public class Doctor {
	
	@Id
	private String id;
	private String FirstName;
	private String LastName;
	private String email;
	private Gender gender;
	private String age;
	private String city;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}



	private String qualification;
	private String mobileNo;
	private String date;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	

	
	
	public Doctor(String id ,String firstName, String lastName, String email, Gender gender, String city, String age,
			String date, String mobileNo , String qualification) {
		this.id=id;
		this.FirstName=firstName;
		this.LastName=lastName;
		this.gender= gender;
		this.mobileNo=mobileNo;
		this.city=city;
		this.email=email;
		this.age=age;
		this.date = date;
		this.qualification=qualification;
	}
	
	
	
@Override
public String toString() {
    return "Doctor{" +
            "id='" + id + '\'' +
            ", firstName='" + FirstName + '\'' +
            ", lastName='" + LastName + '\'' +
             ", gender='" + gender + '\'' +
              ", mobileNo='" + mobileNo + '\'' +
               ", city='" + city + '\'' +
                ", email='" +email + '\'' +
                 ", age='" + age + '\'' +
                  ", date='" + date + '\'' +
                   ", qualification='" + qualification + '\''+ 
                   '}';
}
}
    
    

