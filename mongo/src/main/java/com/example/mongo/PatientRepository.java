package com.example.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Patient;

public interface PatientRepository extends MongoRepository<Patient, String>{

}
