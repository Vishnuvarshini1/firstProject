package org.tcs;

public class Sample_Array { //array decalared by size
	public static void main(String[] args) {
		String s[] = new String[3];
		System.out.println(s.length);
		s[0]="Vishnu";
		s[1]="Varshini";
		s[2]="Riya";
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}


}
