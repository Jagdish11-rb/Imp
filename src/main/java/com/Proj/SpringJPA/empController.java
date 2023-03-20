package com.Proj.SpringJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empController {
	
	@Autowired
	private empService service;
	
	@PostMapping("/employees")
	public ResponseEntity<Object> save( @RequestBody Employee employee) {
	     service.save(employee);
		//URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId().toUri());
		return ResponseEntity.created(null).build();
	}
	
	@GetMapping("/employees")
	public List<Employee> retrieve(){
		return service.retrieve();
	}
	
	@GetMapping("/employees/{id}")
	public Employee retrieveOne(@PathVariable int id) {
		Employee employee=service.retrieveOne(id);
		return employee;
	}
	
	@RequestMapping(value="/employees/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Object> deleteOne(@PathVariable Integer id) {
		service.deleteOne(id);
		System.out.println("Employee Removed");
		return ResponseEntity.accepted().build();
	}
}
