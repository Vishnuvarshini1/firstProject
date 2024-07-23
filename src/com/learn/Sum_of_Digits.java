package com.learn;

public class Sum_of_Digits {
public static void main(String[] args) {
	int a=225,sum=0;
	int i=0;
	while(a>0) {
		i=a%10;
		sum=sum+i;
		a=a/10;
		
	}
	System.out.println(sum);
}
}
