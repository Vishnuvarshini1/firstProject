package com.wipro;
import java.util.*;
public class Student {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the StudentId:");
	int studentId = Integer.parseInt(sc.nextLine());
	System.out.println("Enter the StudentName:");
	String studentName = sc.nextLine();
	System.out.println("Mark1:");
	int mark1 = Integer.parseInt(sc.next());
	System.out.println("Mark2:");
	int mark2 = sc.nextInt();
	System.out.println("Mark3:");
	int mark3 = sc.nextInt();
	int total=mark1 + mark2+ mark3;
	double avg_mark= total/3;
	System.out.println("Student ID is: "+studentId);
	System.out.println("Student Name is: "+studentName);
	System.out.println("Mark1: "+mark1);
	System.out.println("Mark2: "+mark2);
	System.out.println("Mark3: "+mark3);
	System.out.println("Total: " +total);
	System.out.println("Average Mark: "+avg_mark);
	}
}
