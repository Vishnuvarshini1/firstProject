package com.learn;

public class Casting_learn {
	public static void main(String[] args) {
		byte age =20;
		System.out.println("Before implicit casting" + age);
		int  myAge =age;
		System.out.println("After implicit casting" + myAge);
		boolean presents = true;
		System.out.println("Before implicit casting" + presents);
		// boolean cannot cast with other data type byte myPresents = presents;
		//System.out.println("Before implicit casting" + age);
		//short 
		char  gender ='F';
		System.out.println("Before implicit casting" + gender);
		int myGender = gender;
		//short myGender = gender;
		System.out.println("After implicit casting" + myGender);
		/*int reg_num=232334443;
		System.out.println("Before implicit casting" + reg_num);
		float myReg = reg_num;
		System.out.println("After implicit casting" + myReg);*/		
	
	}
}
