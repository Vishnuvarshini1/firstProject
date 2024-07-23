package org.tcs;

public class Income {
	public void incomeMethod(double salary,double gst) {
		double Income = salary-gst;
		System.out.println(Income);
	}
	public void superclassMethod() {
		System.out.println("SUPER class Method");
	}
}
