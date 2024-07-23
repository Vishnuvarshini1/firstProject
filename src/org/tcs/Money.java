package org.tcs;

public class Money extends Savings {
	public static void main(String[] args) {
		Income i = new Savings();//cross platform
		i.incomeMethod(45000, 4500);
		i.superclassMethod();
		
		}
}
