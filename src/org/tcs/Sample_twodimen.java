package org.tcs;

public class Sample_twodimen {
public static void main(String[] args) {
	String[][] s = new String[4][3];
	System.out.println(s.length); //length of array depends on rows
	s[0][0]="Name";
	s[0][1]="Phone no";
	s[0][2]="Gender";
	
	s[1][0]="Vishnu";
	s[1][1]="8765857363";
	s[1][2]="M";
	
	s[2][0]="Varshini";
	s[2][1]="7874563211";
	s[2][2]="F";
	
	s[3][0]="Riya";
	s[3][1]="6987532424";
	s[3][2]="F";
	
	for(int i=0;i<s.length;i++) { //Rows
		for(int j=0;j<s.length-1;j++) { // column
			System.out.println(s[i][j]);
			
		}
	}
}
}
