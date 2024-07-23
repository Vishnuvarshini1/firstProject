package org.test;

import java.util.Scanner;

public class Test_Compare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the input1:");
	String s = sc.nextLine();
	System.out.println("Enter the input2");
	String s1 = sc.nextLine();
	System.out.println(s.compareTo(s1));
}
}
