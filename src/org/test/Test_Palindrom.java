package org.test;

public class Test_Palindrom {
public static void main(String[] args) {
	String s="wow";
	String res="";
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		res=res+ch;
		
	}
	if(res.equals(s)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}
