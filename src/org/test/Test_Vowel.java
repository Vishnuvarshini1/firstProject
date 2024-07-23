package org.test;

public class Test_Vowel {
public static void main(String[] args) {
	String s="Welcome";
	String vowel="";
	String consonant="";
	int vowelcount=0;
	int consonantcount=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			vowelcount++;
			vowel=vowel+ch;
		}
		else {
			consonantcount++;
			consonant=consonant+ch;
		}
	}
	System.out.println(vowelcount);
	System.out.println(vowel);
	System.out.println(consonantcount);
	System.out.println(consonant);
}
}
