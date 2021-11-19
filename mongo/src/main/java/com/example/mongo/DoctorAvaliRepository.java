package com.example.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.DoctorAvali;

public interface DoctorAvaliRepository extends MongoRepository<DoctorAvali, String> {

}
