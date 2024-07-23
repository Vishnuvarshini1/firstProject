package com.learn;

public class Exception_Test {
public static void main(String[] args) {
	System.out.println("Program starts here");
	int a=10;
	int b=0;
	try {
	int c=a/b;
	System.out.println(c);
	}catch(ArithmeticException e) {
		//e.printStackTrace();
		System.out.println(e);
	}
	
	System.out.println("program ends here");
	
}
}
