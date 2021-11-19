package com.example.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.entity.Address;
import com.example.entity.Gender;

import lombok.Data;

@Data
@Document(collection = "Patient")
public class Patient  {
	@Id
	private String id;
	private String FirstName;
	private String LastName;
	private String email;
	private String gender;
	private String address;
	private String age;
	private String date;
	private String MobileNo;
	private String appointmentdate;
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getAppointmentdate() {
		return appointmentdate;
	}



	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}



	public String getFinalReport() {
		return finalReport;
	}



	public void setFinalReport(String finalReport) {
		this.finalReport = finalReport;
	}





	private String finalReport;
	
	
	 


	
	
public Patient(String id, String firstName, String lastName, String email, String gender, String address,
			String age, String date, String mobileNo, String appointmentdate, String finalReport) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.age = age;
		this.date = date;
		MobileNo = mobileNo;
		this.appointmentdate = appointmentdate;
		this.finalReport = finalReport;
	}



//	public Patient(String FirstName,String LastName,String email, Gender gender,Address address,String age,String date, String mobileNo ) {
//		
//		this.FirstName = FirstName;
//		this.LastName= LastName;
//		this.email=email;
//		this.gender=gender;
//		this.address=address;
//		this.age=age;
//		this.date=date;
//		this.MobileNo=  MobileNo;
//	}

	public Patient() {
		// TODO Auto-generated constructor stub
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}





@Override
public String toString() {
    return "Doctor{" +
            "id='" + id + '\'' +
            ", firstName='" + FirstName + '\'' +
            ", lastName='" + LastName + '\'' +
             ", gender='" + gender + '\'' +
              ", mobileNo='" + MobileNo + '\'' +
                ", email='" +email + '\'' +
                 ", age='" + age + '\'' +
                  ", date='" + date + '\'' +
                   
                   '}';
}
}