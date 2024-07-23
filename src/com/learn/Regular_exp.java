package com.learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_exp {
	
		public static boolean isValidPincode(String pincode) {
String regax="^[1-9]{1}[0-9]{2}\\\\s{0,1}[0-9]{3}$";
Pattern p=Pattern.compile(regax);
if(pincode==null) {
	return true;
}
Matcher m=p.matcher(pincode);
return m.matches();
}
public static void main(String[] args) {
	String num1="654398";
	System.out.println(num1+ ": "+isValidPincode(num1));
	String num2="201 305";
	System.out.println(num2+": "+isValidPincode(num2));
}	
}