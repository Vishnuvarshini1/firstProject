package com.learn;

public class Explicit_Cast_learn {
	public static void main(String[] args) {
		short age =200;
		System.out.println("Before explicit casting " + age);
		byte  myAge =(byte) age;
		System.out.println("After explicit casting  " + myAge);
		char gender ='f';
		System.out.println("before explicit casting " +gender);
		byte myGender =(byte) gender;
		System.out.println("After explicit casting "  +myGender);
		double bus_fee= 500.234556;
		System.out.println(bus_fee);
		byte myBus_fee=(byte) bus_fee;
		System.out.println(myBus_fee);
		int reg_num=232334443;
		System.out.println(reg_num);
	//	boolean myReg = (boolean) reg_num;
		//System.out.println(myReg);
		
	}

}
