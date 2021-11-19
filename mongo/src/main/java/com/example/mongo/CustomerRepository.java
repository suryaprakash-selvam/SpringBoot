package com.example.mongo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {
	
    Customer findOneByFirstName(String fistName);
    
    List<Customer> findByLastName(String lastName);    
}