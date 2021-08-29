package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialsService {

	//generate email address
	public String generateEmailAddress(Employee emp) {
		//generate email and return
		
		StringBuilder builder = new StringBuilder();
		
		builder
			.append( emp.getFirstName() )
			.append( emp.getLastName() )
			.append( "@" )
			.append( emp.getDepartment() )
			.append( ".abc.com" );

		return builder.toString();
	}
	
	//generate password
	public String generatePassword() {
		/**
		 * generate a String of 8 characters (randomly chosen from upercase, lowercase, digits, special characters) 
		 */
		String allPossibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>)";
		String password = "";
		
		Random random = new Random();
		
		// You can do this 8 times and then form the password based on the random string (with single character) obtained
		
		for(int i = 0; i < 8; i++) {
			int index = random.nextInt(allPossibleChars.length());
			password += allPossibleChars.charAt(index);
		}
		return password;
	}
	
	public void showCredentails(Employee emp, String email, String password) {
		StringBuilder builder = new StringBuilder();
		builder
			.append("Dear ")
			.append(emp.getFirstName())
			.append(" your generated credentials are as follows ")
			.append("\n")
			.append("Email --> ")
			.append(email)
			.append("\n")
			.append("Password --> ")
			.append(password);
		
		System.out.println(builder);
	}
	
}
