package com.example.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Patient;
import com.example.entity.Receptionist;

@Service
public class PatientService {

	
	@Autowired
	PatientRepository patientRepository;
	
	public List<Patient> getPatient(){
		return patientRepository.findAll();
		}

	public Patient addpat(Patient pat) {
	
		return patientRepository.save(pat);
	}

	
}
