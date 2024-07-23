package com.wipro;

import java.util.Scanner;

//import com.learn.QuestionPaper;

public class Animal {
//	public void name(String name) {
//		System.out.println("Animal name is "+ name);
//	}
//	public void color(String name,String color) {
//		System.out.println(name + "color is"+ color);
//	}
//	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.name("Dog");
//		a.color("Dog", "Black");
//		QuestionPaper q = new QuestionPaper();
//		q.twoMarkQuestion();
//		q.fiveMarkQuestion();
//	}
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the animal name");
	String animalName =sc.nextLine();
	System.out.println("Enter the animal age");
	byte animalAge = Byte.parseByte(sc.nextLine());
	//boolean presents = Boolean.parseBoolean(sc.nextLine());
	System.out.println("Enter the breed name");
	String breedName = sc.nextLine();
	System.out.println("Animal name is"+ animalName);
	System .out.println("Animal age is "+ animalAge);
	//System.out.println("Animal presents"+ presents);
	System.out.println("Animal breed name is"+ breedName);
	
	}
	
}
