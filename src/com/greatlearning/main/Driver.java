package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

public class Driver {
	private static final Scanner sc = new Scanner(System.in);
	
	//Department Options to show
	private static int displayDepartmentMenu() {
		System.out.println( "-------------------------------" );
		System.out.println( "1. Technical" );
		System.out.println( "2. Admin" );
		System.out.println( "3. Human Resource" );
		System.out.println( "4. Legal" );
		System.out.println( "-------------------------------" );
		System.out.println( "Enter choice" );
		
		int choice = sc.nextInt();
		
		return choice;
	}
	
	private static String getDepartmentCode(int UserInputForDept) {
		String deptCode = null;
		switch( UserInputForDept ) {
		case 1:
			deptCode = "tech";
			break;
		case 2:
			deptCode = "adm";
			break;
		case 3:
			deptCode = "hr";
			break;
		case 4:
			deptCode = "lg";
			break;
		default:
			System.out.println("Incorrect input");
			return null;
		}
		return deptCode;
	}
	
	public static void main(String[] args) {
		String firstName; 
		String lastName; 
		String departmentCode;
		Employee emp = null;
		
		//Accept firstName, lastName, department as input from terminal
		System.out.println("Please provide FirstName");
		firstName = sc.next();
		
		System.out.println("Please provide LastName");
		lastName = sc.next();
		
		System.out.println("Please provide Department");
		//displayDepartmentMenu();
		departmentCode = getDepartmentCode(displayDepartmentMenu());
		
		if(departmentCode != null) {
			//Create employee object (emp)
			emp = new Employee(firstName, lastName, departmentCode);
		} else {
			System.out.println("Incorrect input for department option");
		}

		
		//Create an object of CredentailsService (cs)
		CredentialsService cs = new CredentialsService();
		
		//Use cs to...
		/*
		 * Generate email and store it 
		 */
		String email = cs.generateEmailAddress(emp);
		System.out.println("Email: " + email);
		
		/*
		 * Generate password and store it
		 */
		String password = cs.generatePassword();
		System.out.println("Password: " + password);
		 
		/* 
		 * show the credentials
		 */
		cs.showCredentails(emp, email, password);
		
	}
	
}
