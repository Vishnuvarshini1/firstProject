package org.test;

public class Test_Spilt {
public static void main(String[] args) {
	String s="Welcome to java class";
	System.out.println(s.length());
	String []word=s.split(" ");
	for(int i=0;i<s.length();i++) {
		System.out.println(word[i]);
	}
}
}
