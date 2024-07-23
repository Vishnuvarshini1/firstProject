package com.learn;

public class Sample1 extends Exception{
@Override
public String getMessage() {
	return "You are not authorised person";
}
}
