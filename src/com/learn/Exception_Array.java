package com.learn;

public class Exception_Array {
public static void main(String[] args) {
	System.out.println("program starts here");
	int a[]= {10,20,30};
	System.out.println(a[1]);
	try {
	System.out.println(a[4]);
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	System.out.println("program ends here");
}
}
