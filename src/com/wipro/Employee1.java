package com.wipro;
import java.util.*;
public class Employee1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empID");
		int empID = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the empName");
		String empName =sc.nextLine();
		System.out.println("Enter the empEmail");
		String empEmail = sc.nextLine();
		System.out.println("Enter the empPhoneno");
		Long empPhoneno =Long.parseLong(sc.nextLine()); 
		System.out.println("Enter the empSalary");
		float empSalary = Float.parseFloat(sc.nextLine());
		System.out.println("Enter the empGender");
		String empGender = sc.next();
		System.out.println("Enter the empCity");
		String empCity = sc.next();
		System.out.println("Employee ID is: "+ empID);
		System.out.println("Employee Name is:"+ empName);
		System.out.println("Employee Email is:" + empEmail);
		System.out.println("Employee Phoneno is:" +empPhoneno);
		System.out.println("Employee Salary is: "+ empSalary);
		System.out.println("Employee Gender is :"+empGender);
		System.out.println("Employee City is:"+empCity);
	}
}
