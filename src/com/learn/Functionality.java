package com.learn;

public class Functionality implements Atm {
	@Override
public void depositmethod() {
	System.out.println("Deposit method");
}
@Override	
public void withdrawmethod() {
	System.out.println("Withdraw method");
}
public void functionality() {
	System.out.println("Function method");
}
public static void main(String[] args) {
	Atm a = new Functionality();
	a.depositmethod();
	a.withdrawmethod();
	
}
}
