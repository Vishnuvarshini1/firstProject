package com.wipro;

public class Child1 extends Parent{
	public void child1Property() {
		System.out.println("Child1 property");
	}
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.parentProperty();
		c.child1Property();
		
	}
}
