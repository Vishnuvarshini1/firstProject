package org.test;

public class Test_Count {
public static void main(String[] args) {
	String s="Welcome";
	int vowel =0;
	int consonant =0;
	char[] input=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		switch (input[i]) {
		case 'a':
			vowel++;
			break;
		case 'e':
			vowel++;
			break;
		case 'i':
			vowel++;
			break;
		case 'o':
			vowel++;
			break;
		case 'u':
			vowel++;
			break;
			default:
				consonant++;
		}
	}
	System.out.println(vowel);
	System.out.println(consonant);
}
}
