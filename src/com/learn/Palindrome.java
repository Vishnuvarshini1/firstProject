package com.learn;

public class Palindrome {
public static void main(String[] args) {
	for(int k=1;k<=1000;k++) {
	int i=0,j=0,n=0;
	int a=k;
	 n=a;
	while(a>0) {
		i=a%10; //separate 
		j=(j*10)+i;  //reverse 
		a=a/10; //decrement 
	}
	if(n==j) {
		System.out.print(n+ " ");
	}
	}
	
}
}
