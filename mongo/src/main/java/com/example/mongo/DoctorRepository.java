package com.example.mongo;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Doctor;


public interface  DoctorRepository  extends MongoRepository<Doctor, String> { 
}