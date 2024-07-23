package com.learn;

public class Conditionstmt_Test {
public static void main(String[] args) {
	int mark=65;
	if(mark>60) {
		if(mark>70) {
				
			if(mark>90) {
				System.out.println("Student is passed in merit");
			}
		}else {
			System.out.println("Student is passed in first class");
		}
	}else {
		System.out.println("Student is passed in second class");
	}
}
}
