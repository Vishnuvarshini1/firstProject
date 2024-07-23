package org.tcs;

public class Sample_String {
public static void main(String[] args) {
	String s="AiiTE Academy";
	String s1="Welcome All";
	String s2="AIITE ACADEMY";
	int a=124;
	System.out.println(s.length());
	System.out.println(s.charAt(4));
	System.out.println(s.contains("m"));
	System.out.println(s.endsWith("E"));
	System.out.println(s.hashCode());
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s.indexOf('i'));
	System.out.println(s.isEmpty());
	System.out.println(s.lastIndexOf('y'));
	System.out.println(s.replace('a', 'r'));
	System.out.println(s.substring(6));
	System.out.println(s.substring(5, 13));
	System.out.println(s.trim());
	//System.out.println(s.startsWith("A"));
	System.out.println(s.concat(s1));
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s2));
	System.out.println(s2.replace('I', 'i'));
	System.out.println(s.replaceAll("Aii", "aII"));
	char[] c= s1.toCharArray();
	System.out.println(c.length);
	
	System.out.println(c[4]);
	String s3=String.valueOf(a);
	System.out.println(s3.charAt(0));
	
	String [] s4=s.split("");
	for(int i=0;i<s.length();i++) {
		System.out.print(s4[i]);
		
	}
	
	
	
}
}
