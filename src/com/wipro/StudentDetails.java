package com.wipro;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Student ID");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the Student Name");
		String name =sc.nextLine();
		System.out.println("Enter the Student Email");
		String email =sc.nextLine();
		System.out.println("Enter the Student Phone Number");
		long ph_no=Long.parseLong(sc.nextLine());
		System.out.println("Enter the Student Dept");
		String dept =sc.nextLine();
		System.out.println("Enter the Student Gender");
		String gender=sc.next();
		System.out.println("Enter the Student City");
		String city =sc.next();
		System.out.println("Student Id is"+ id);
		System.out.println("Student Name is "+ name);
		System.out.println("Student Email is"+email);
		System.out.println("Student phone number is"+ ph_no);
		System.out.println("Student Department is"+ dept);
		System.out.println("Student gender is"+ gender);
		System.out.println("Student City is"+city);
				}
		}

