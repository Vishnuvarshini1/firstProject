package org.tcs;

public class Reverse {
public static void main(String[] args)
{
	String s="Welcome";
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		rev=rev+ch;
		//System.out.println(rev);
	}
	System.out.println(rev);
}
}
