package com.example.mongo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Receptionist;

public interface  ReceptionistRepository extends MongoRepository<Receptionist, String> {
	
	
    
}
    