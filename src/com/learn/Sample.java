package com.learn;

public class Sample extends Constructor_Ex{

	Sample(){
		super();
		System.out.println("Default constructor in child class");
	}
	Sample(char c){
		this(); //chaining constructor
		System.out.println("Character"+c);
	}
	public static void main(String[] args) {
		Sample s = new Sample('a');
}

}
