package com.learn;

public class Calculator {
	public void addMethod(){
		System.out.println("addition");
	}
	public void subMethod() {
		System.out.println("Subtraction");
	}
	public void multiMethod() {
		System.out.println("Multiplication");
	}
	public void diviMethod() {
		System.out.println("Division");
	}
	
	public static void main(String[] args){
		Calculator calc = new Calculator();
		calc.addMethod();
		calc.addMethod();
		calc.subMethod();
		calc.subMethod();
		calc.subMethod();
		calc.subMethod();
		calc.multiMethod();
		calc.diviMethod();
	
		
	}
	

}
