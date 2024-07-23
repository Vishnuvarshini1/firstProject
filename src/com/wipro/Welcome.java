package com.wipro;



public class Welcome{
	String name="welcome";
	static String name1="AiiTE";
	static {
		System.out.println("Static block:");
	}
	public void welcomemethod() {
		System.out.println("Welcome");
	}
public static void main(String[] args)
{
	Welcome w= new Welcome();
	w.welcomemethod();
	w.welcomemethod();
	
	System.out.println(Welcome.name1);

}
}
