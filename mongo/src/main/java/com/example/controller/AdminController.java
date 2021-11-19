package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Admin;
import com.example.mongo.AdminService;

@RestController
public class   AdminController {

   @Autowired
   AdminService   adminservice;
	
@RequestMapping(value = "login/{id}/{pwd}", method = RequestMethod.GET)
public   Admin   admin(@PathVariable String id , @PathVariable String pwd) {
	System.out.print("APIS :"+ id +"admin :"+ pwd);
	return   adminservice.res(id,pwd) ;
}

	

@RequestMapping(value="/addAdmin",method=RequestMethod.POST)
public Admin adduser() {
	
	Admin a = new Admin();
	a.setRole("Admin");
	
	return a ;
}

}
