package com.example.mongo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Receptionist;
import com.google.gson.Gson;

@Service
public class ReceptionistService {

	    @Autowired
	    private ReceptionistRepository repository;
	
	 Gson gson=new Gson();
	 
	public List<Receptionist> res(){
			return repository.findAll();
	}

	public Receptionist addresp(Receptionist doc) {
		
		return repository.save(doc);

	}

}
