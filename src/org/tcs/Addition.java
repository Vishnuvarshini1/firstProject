package org.tcs;

public class Addition {
public void add(int a, int b) 
{
	int c= a+b;
	System.out.println(c);
}
public void add(double a,double b) {
	double c= a+b;
	System.out.println(c);
}
public void add(int a,int b, int c) {
	int d= a+ b+c;
	System.out.println(d);
}
public void add(int a,double b) {
	double e= a+b;
	System.out.println(e);
}
public static void main(String[] args) {
	Addition a = new Addition();
	a.add(2, 3);
	a.add(12.0,23.7 );
	a.add(3,7,9);
	a.add(23, 5.98);
	
}
}
