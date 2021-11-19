package com.example.mongo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.example.entity.Doctor;
import com.example.entity.DoctorAvali;
import com.example.entity.Patient;
import com.google.gson.Gson;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository repository;
	@Autowired
	private DoctorAvaliRepository doctorAvaliRepository;

	@Autowired
	PatientRepository patientRepository;
	@Autowired
	private MongoTemplate mongoTemplate;

	Gson gson = new Gson();

	public Doctor saveDoctor(Doctor id) {
		Doctor d = new Doctor();

		try {
//			d = repository.findById(id);
		
		  
			d = repository.save(id);
			System.out.print("checking " + gson.toJson(d));
		} catch (Exception e) {
			System.out.print("exception : not updated" + gson.toJson(d));
		}
		return d;
	}

	public List<Doctor> getdoctor() {
		return repository.findAll();
	}

//	public Doctor updateDoctor(String fname,String age) {
//		
//		Doctor d =  new Doctor();	
//		Query query = new Query();
//		query.addCriteria(Criteria.where("FirstName").is(fname));
//		d=mongoTemplate.findOne(query, Doctor.class);
//		
//		d.setAge(age);
//		
//		
//		return mongoTemplate.save(d);
//		 
//	}

	public Patient updateDoctor(String fname, String age) {

		Query query = new Query();
		query.addCriteria(Criteria.where("FirstName").is(fname));
		Patient patient = new Patient();
		patient= mongoTemplate.findOne(query, Patient.class);
	    patient.setFinalReport(age);


		return  mongoTemplate.save(patient);

	}

	public List<DoctorAvali> getDoctorAvali() {
		
		return doctorAvaliRepository.findAll();
	}

	public DoctorAvali setDoctorAvali(DoctorAvali doctavil) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("FirstName").is(doctavil.getPatientName()));
		Patient patient = new Patient();
		patient= mongoTemplate.findOne(query, Patient.class);
	    patient.setAppointmentdate(doctavil.getTime());
	    mongoTemplate.save(patient);
	   
		return doctorAvaliRepository.save(doctavil);
	}

	
}
