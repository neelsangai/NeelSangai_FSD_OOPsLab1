package com.greatleaning.email.application;

import java.util.Scanner; // importing Scanner class from java.util.

import com.greatleaning.email.credentialservices.CredentialServices; // importing CredentialServices class from com.greatlearning.email.credentialservices
import com.greatlearning.email.model.Employee; // importing Employee class from package com.greatlearning.email.model.

public class Main {

	// main method.

	public static void main(String[] args) {

		Employee emp = new Employee("neel", "sangai");       // Creating object of class Employee and assigning parameters.
		CredentialServices cs = new CredentialServices();             //Creating object of class CredentialServices.
		String generatedEmail;                                                  // generatedEmail to keep generatedEmail of Employee.
		String generatedPassword;        // generatedPassword to keep generatedPassword of Employee.


		/*
		 * Asking User to input a Department.
		 * 
		 * 
		 */

		System.out.println("Please Enter Department From The Following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resourse");
		System.out.println("4.Legal");

		Scanner sc = new Scanner(System.in);  // Creating Scanner class object.
		int input = sc.nextInt();

		/*
		 * Switch case to Decide use output .
		 */

		switch (input) {

		case 1:{ generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "tec");
				generatedPassword=cs.generatePassword();
				cs.showCredentials(emp, generatedEmail, generatedPassword);
			break;
		}
		case 2:{ generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "adm");
		generatedPassword=cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
	break;
}

		case 3 :{ generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "hr");
		generatedPassword=cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
	break;
}

		case 4:{ generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "leg");
		generatedPassword=cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
	break;
}







	}

}
}