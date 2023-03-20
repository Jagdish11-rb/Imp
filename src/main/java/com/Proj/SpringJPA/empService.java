package com.Proj.SpringJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class empService {
	
	@Autowired
	private empRepo repository;
	
	
	BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
	
	public Employee save(Employee employee){
		String encpswrd=passwordEncoder.encode(employee.getPassword());
		employee.setPassword(encpswrd);
		 return repository.save(employee);
	}
	
	public List<Employee> retrieve(){
		return repository.findAll();
	}
	
	public Employee retrieveOne(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public void deleteOne(int id) {
		 repository.deleteById(id);
	}
}
