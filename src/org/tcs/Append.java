package org.tcs;

public class Append {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("AIITE");
		StringBuffer s1 = new StringBuffer("AIITE");
		System.out.println(s);
		s.append("Academy");
		System.out.println(s);
		s1.reverse();
		System.out.println(s1);
	}
}
