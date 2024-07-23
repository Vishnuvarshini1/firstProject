package org.test;

public class Test_Splits {
public static void main(String[] args) {
	String s= "Welcome to java class";
	String [] word=s.split("l");
	for(int i=0;i<=s.length();i++) {
		System.out.println(word[i]);
	}
}
}
