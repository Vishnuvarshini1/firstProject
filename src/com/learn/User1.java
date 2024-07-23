package com.learn;

public class User1 extends GmailSignUp {
public static void main(String[] args) {
	User1 u = new User1();
	u.setusername("Vishnu");
	System.out.println(u.getusername());
	u.setpassword("jfd#123");
	System.out.println(u.getPassword());
}
}
