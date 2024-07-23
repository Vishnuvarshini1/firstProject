package org.tcs;

public class Non_literal_String {
 public static void main(String[] args) {
	 String s = new String("AIITE");
	 String s1= new String("AIITE");
	 System.out.println(s);
	 System.out.println(System.identityHashCode(s));
	 System.out.println(System.identityHashCode(s1));
	 System.out.println(s.hashCode());
	 System.out.println(s1.hashCode());
	 // == and .equals
	 System.out.println(s==s1);
	 System.out.println(s.equals(s1));
 
 
 }
}
