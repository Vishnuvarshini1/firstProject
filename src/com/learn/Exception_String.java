package com.learn;

public class Exception_String {
public static void main(String[] args) {
	System.out.println("program starts here");
	String s="AiiTE";
	System.out.println(s.charAt(2));
	try {
		System.out.println(s.charAt(6));
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	System.out.println("program ends here");
			
}
}
