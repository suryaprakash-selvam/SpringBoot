package com.example.mongo;
	
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Admin;


public interface  AdminRepository extends MongoRepository<Admin, String> {
		
		Admin findOneByUserName(String userName);
		Admin findByUserName(String userName);
}

