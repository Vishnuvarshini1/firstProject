package com.learn;

public class Armstrong {
	
public static void main(String[] args) {
	for(int k=100;k<=1000;k++) {
	int a=k,n=0;
	int i=0,j=0;
	n=a;
	while(a>0) {
		i=a%10;//100%10=0
		j=j+(i*i*i);//0+1000
		a=a/10;//10
		
	}
	if(n==j) {
		System.out.print(j+ " ");
	}
	
}
}
}