package com.bridgelabzregex;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
	  Scanner scanner  = new Scanner(System.in);
      RegexRegistration regex = new RegexRegistration();
   
 
	  System.out.println("Enter your FirstName:");
	 
	  String firstName = scanner.next(); 
	  regex.userFirstName(firstName);
	  
	  System.out.println("Enter your LastName:");

	  String lastName = scanner.next(); 
	  regex.userLastName(lastName);

      System.out.println("Enter your email id:");
      
      String email = scanner.next();
      regex.userEmail(email);
	  
	}
	
}
� 2022 GitHub, Inc.