package com.Proj.SpringJPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_details")
public class Employee {
	
	@Id
	private Integer Id;
	
	@Column(name="employee_name")
	private String Name;
	
	private String Email;
	
	private String Password;
	
	private long Pincode;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String email, String password, long pincode) {
		super();
		Id = id;
		Name = name;
		Email = email;
		Password = password;
		Pincode = pincode;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public long getPincode() {
		return Pincode;
	}
	public void setPincode(long pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + ", Pincode="
				+ Pincode + "]";
	}
	
}
