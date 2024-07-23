package org.test;

import java.util.Scanner;

public class Test_Equal {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String1:");
	String name = sc.nextLine();
	System.out.println("Enter the String2:");
	String name1=sc.nextLine();
	System.out.println(name.equalsIgnoreCase(name1));
}
}
