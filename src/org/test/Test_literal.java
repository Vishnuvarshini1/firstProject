package org.test;

public class Test_literal {
public static void main(String[] args) {
	String s ="Nisha";
	String s1="Rengan";
	String s2= "NishaRengan";
	
	System.out.println(s);
	System.out.println(System.identityHashCode(s));
	System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
	System.out.println(s2);
	System.out.println(System.identityHashCode(s2));


}
}
