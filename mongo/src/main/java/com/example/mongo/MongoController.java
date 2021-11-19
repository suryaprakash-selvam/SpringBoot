package com.example.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Admin;
import com.example.entity.Doctor;
import com.example.entity.DoctorAvali;
import com.example.entity.Patient;
import com.example.entity.Receptionist;
import com.google.gson.Gson;

@RestController
@CrossOrigin("*")
public class MongoController {

   @Autowired
	MongoServices mongoservice;
   
   @Autowired
   AdminService  adminservice;
   @Autowired 
   DoctorService doctorService;
   @Autowired 
   ReceptionistService receptionistService;
   
   @Autowired 
   PatientService  patientService;
   Gson gson = new Gson();


@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
public Customer customer(@PathVariable String id) {
	return mongoservice.res(id);
}


/// Admin add user and checking login

@RequestMapping(value="/addUser",method=RequestMethod.POST)
public Admin adduser(@RequestBody Admin admin) {

	System.out.println("admin checking : "+ gson.toJson(admin));
	return adminservice.addUser(admin) ;
}

@RequestMapping(value="/getLogin",method=RequestMethod.GET)
public List<Admin> getLogin() {
	
	return adminservice.getlogin() ;
}


@RequestMapping(value = "/login", method = RequestMethod.GET)
public Admin admin(@RequestParam String id , @RequestParam String pwd) {
	
	System.out.println("APIS :"+ id +"admin :"+ pwd);
	return   adminservice.res(id,pwd) ;
}

// doctor details updation

@RequestMapping(value = "/getDoctorDetails", method = RequestMethod.GET)
public List<Doctor> getDoctor(){
	return doctorService.getdoctor();
}

@RequestMapping(value="/addDoctor",method=RequestMethod.POST)
public Doctor addDoctor(@RequestBody Doctor doc) {
	
	return doctorService.saveDoctor(doc);
}


@RequestMapping(value="/resp",method = RequestMethod.GET)
public List<Receptionist> getResp(){
	
	return receptionistService.res() ;
}

@RequestMapping(value="/addreps",method=RequestMethod.POST)
public Receptionist addReps(@RequestBody Receptionist  doc) {
	
	return receptionistService.addresp(doc);
}

@RequestMapping(value="/getDoctorAval",method = RequestMethod.GET)
public List<DoctorAvali> getDocAval(){
	
	return doctorService.getDoctorAvali() ;
}

@RequestMapping(value="/setDoctorAval",method = RequestMethod.POST)
public DoctorAvali setDocAval(@RequestBody DoctorAvali doctavil ){
	
	return doctorService.setDoctorAvali(doctavil) ;
}


@RequestMapping(value="/updatePatient/{name}/{report}",method=RequestMethod.GET)
public Patient updateDoctor(@PathVariable(value="name") String name , @PathVariable(value="report") String report) {
	return doctorService.updateDoctor(name,report);
}

@RequestMapping(value="/getPatient",method = RequestMethod.GET)
public List<Patient> getPatient() {
	return patientService.getPatient() ;
	
}

@RequestMapping(value="/addpatient",method=RequestMethod.POST)
public Patient addPatient(@RequestBody Patient  pat) {
	
	return patientService.addpat(pat);
}



}
