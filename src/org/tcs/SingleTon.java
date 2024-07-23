package org.tcs;

public class SingleTon {
private SingleTon() {
	
}
private static SingleTon singleton = new SingleTon();
public static SingleTon getInstance() {
	return singleton;
}
public static void main(String[] args) {
	SingleTon s = SingleTon.getInstance();
	System.out.println(System.identityHashCode(singleton));
	System.out.println(System.identityHashCode(s));
	SingleTon s1 = SingleTon.getInstance();
	System.out.println(System.identityHashCode(s1));
	SingleTon s2 = SingleTon.getInstance();
	System.out.println(System.identityHashCode(s2));
	SingleTon s3 = SingleTon.getInstance();
	System.out.println(System.identityHashCode(s3));
}
}
