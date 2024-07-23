package org.test;

import java.util.Scanner;

public class Test_presents {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the input1:");
	String emailid=sc.nextLine();
	
	//String emailid= "Nishakerala24@gmail.com";
	if(emailid.contains("gmail")) {
		System.out.println(emailid.replace("gmail", "yahoo"));
	}

	
	}
	
	
	}

