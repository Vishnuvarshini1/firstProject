package com.learn;

public class Child implements Father,Mother{
@Override
public void study() {
	System.out.println("Engineering");
}
@Override
public void fatherMethod() {
	System.out.println("Father Method");
}
@Override
public void motherMethod() {
	System.out.println("Mother Method");
}
public static void main(String[] args) {
	Father f = new Child();
	f.study();
	f.fatherMethod();
	Mother m = new Child();
	m.study();
	m.motherMethod();
}
}
