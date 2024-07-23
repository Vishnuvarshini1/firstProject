package com.learn;

public class Constructor_Ex {
void example() {
	System.out.println("Normal method");
}
Constructor_Ex(){
	this(5);
	System.out.println("Default Constructor");
}
Constructor_Ex(int a){
	this("vishnu");
	System.out.println("paramertized constructor");
}
Constructor_Ex(String name){
	
	System.out.println(" String Constructor "+name);
}
public static void main(String[] args) {
	Constructor_Ex constr= new Constructor_Ex();
	constr.example();//normal method can also be called.
			}
}
