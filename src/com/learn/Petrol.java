package com.learn;

public class Petrol implements Liquid,Fuel {

	@Override
	public void fuel() {
		System.out.println("petrol has fuel");	
	}

	@Override
	public void liquid() {
		System.out.println("petrol has liquid");
	}
	public static void main(String[] args) {
		Liquid l = new Petrol();
		l.liquid();
		Fuel f = new Petrol();
		f.fuel();
	}

}
