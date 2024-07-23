package org.tcs;


public class Savings extends Income {
@Override
	public void incomeMethod(double salary,double gst) {
		double income = salary-gst;//gst 10 percent of income
		double saving=income/10;//10 percent savings
		System.out.println(saving);
	}
	public void subclassMethod() {
		System.out.println("Sub class Method");
	}
	
}
