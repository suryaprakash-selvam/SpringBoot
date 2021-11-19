package com.example.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.example.entity.Admin;
import com.google.gson.Gson;

@Service

public class AdminService {

	@Autowired
	private AdminRepository repository;

	Gson gson = new Gson();

	public Admin res(String id, String password) {
		Admin a = new Admin();

		List<Admin> admin = new ArrayList<Admin>();
		try {
			System.out.println(id);

			admin.addAll(repository.findAll());

			admin.stream().filter(
					adm -> adm.getUserName().equalsIgnoreCase(id) && adm.getPassword().equalsIgnoreCase(password))
					.forEach(selected -> {
						a.setRole(selected.getRole());
					});
			if(null == a.getRole() ) {
				a.setRole("noaccess");
				return a;
			}
			return a;
		} catch (Exception e) {

			System.out.print("exception" + gson.toJson(a));
		}

		return a;

	}
	
	public Admin addUser(Admin admin) {
		
		return repository.save(admin);
	}

	public List<Admin> getlogin() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	
}
