package com.learn;

public class Exception_null {
public static void main(String[] args) {
	System.out.println("program starts here");
	String s=" ";
	String s1=null;
	
	System.out.println(s.length());
	try {
	System.out.println(s1.length());
	}catch(NullPointerException e) {
		System.out.println(e);
	}
	System.out.println("program ends here");
}
}
