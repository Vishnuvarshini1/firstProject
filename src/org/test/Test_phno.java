package org.test;

import java.util.Scanner;

public class Test_phno {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the phno");
	String s=sc.nextLine();
	
	if(s.length()>10) {
		System.out.println("invalid");
	}
	else {
		System.out.println("valid");
	}
	
}
}
