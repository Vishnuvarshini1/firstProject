package org.test;

public class Upper {
public static void main(String[] args) {
	String s="Welcome";
	StringBuffer s1 = new  StringBuffer(s);
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch)) {
			s1.setCharAt(i, Character.toLowerCase(ch));
		}else {
			s1.setCharAt(i, Character.toUpperCase(ch));
		}
	}
	
	System.out.println(s1);
}
}
