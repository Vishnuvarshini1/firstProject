package com.wipro;
import java.util.Scanner;
import java.lang.*;

public class Student1 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Student Name");
		String name =sc.nextLine();
		System.out.println("Enter the Student age");
		byte age=Byte.parseByte(sc.nextLine());
		System.out.println("Enter the Student presents");
		boolean presents =Boolean.parseBoolean(sc.nextLine());
		System.out.println("Enter the Student Mark");
		short mark = Short.parseShort(sc.nextLine());
		System.out.println("Enter the Student Gender");
		String gender=sc.next();
		System.out.println("Enter the Student Register number");
		int reg_num = sc.nextInt();
		System.out.println("Enter the Student Phone Number");
		long ph_no=sc.nextLong();
		System.out.println("Enter the Student course fee");
		float course_fee = sc.nextFloat();
		System.out.println("Enter the Student bus fee");
		double bus_fee = sc.nextDouble();
		System.out.println("Student Name is"+ name);
		System.out.println("Student Age is "+ age);
		System.out.println("Student Presents is "+ presents);
		System.out.println("Student mark is "+ mark); 
		System.out.println("Student gender is"+ gender);
		System.out.println("Student register number is"+reg_num);
		System.out.println("Student phone number is"+ ph_no);
		System.out.println("Student course fee is"+course_fee);
		System.out.println("Student bus fee is"+ bus_fee);

		

		}
		}

