package com.learn;

public class Student1{
	String name ="Varshini";//global variable
	public void gender() {
		char gender='F';//local variable
		System.out.println(gender);
	}
	public static void main(String[] args) {
		int age =20;//instance variable
		System.out.println(age);
		Student1 s = new Student1();
		s.gender();
		System.out.println(s.name);
	}
}
