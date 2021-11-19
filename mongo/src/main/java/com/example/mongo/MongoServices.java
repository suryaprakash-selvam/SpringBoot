package com.example.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

@Service
public class MongoServices {

	 @Autowired
	    private CustomerRepository repository;
	
	 Gson gson=new Gson();
	public Customer res(String id){
		Customer cus = new Customer();
		try {
			cus = repository.findOneByFirstName(id);
			System.out.print("checking " + gson.toJson(cus));
		}catch(Exception e) {
			    cus.setFirstName("no data");
				System.out.print("exception" + gson.toJson(cus));
		}		
				return cus;
		 
	}

}
