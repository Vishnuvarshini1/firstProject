package com.learn;

public class Reverse {
public static void main(String[] args) {
	int a=123;
	int i=0,j=0;
	while(a>0) {
		i=a%10; //separate
		j=(j*10)+i;  //reverse
		a=a/10; //decrement
	}
	System.out.println(j);
}
}
