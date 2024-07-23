package org.tcs;

public class Sample1 {
public static void main(String[] args) {
	String s1="vishnu";
	String s2="vishnu";
	String s3="vishnu";
	String s4="varshini";
	System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
	System.out.println(s2);
	System.out.println(System.identityHashCode(s2));
	System.out.println(s3);
	System.out.println(System.identityHashCode(s3));
	System.out.println(s4);
	System.out.println(System.identityHashCode(s4));
	s2=s2.concat(s4);
	System.out.println(s2);
	System.out.println(System.identityHashCode(s2));
	System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
}
}
