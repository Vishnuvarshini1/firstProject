package com.learn;

public class Loop {
	 public static void main(String[] args) {	
		 
		for(int i=1;i<=5;i++) {
			
			System.out.println();
			for(int space = 5 ; space>i; space--)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print("*"+ " ");
			}
		}
	 }
}