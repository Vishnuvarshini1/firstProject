package com.wipro;

public class Child extends Parent{
	public void childProperty() {
		System.out.println("Child property");
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.childProperty();
		c.parentProperty();
		c.grandparentProperty();
	}
}
