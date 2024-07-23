package com.learn;

public class Count_digit {
public static void main(String[] args) {
	int a=125,count=0;
	while(a>0) {
		a=a/10;
		count=count+1;
		
	}
	System.out.println(count);
}
}
