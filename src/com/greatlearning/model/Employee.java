package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	
	//constructor
	public Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	
	//Getters	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getDepartment() {
		return department;
	}
	
}
