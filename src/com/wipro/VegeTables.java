package com.wipro;

public class VegeTables {
	public void vitamin(String name,String vitamin) {
		System.out.println(name + "has vitamins" + vitamin);
	}
	public void color(String name,String color) {
		System.out.println(name + "color is" + color);
	}
	
	public static void main(String[] args) 
	{
		
		VegeTables v = new VegeTables();
		v.vitamin("Carrot", "D");
		v.color("Carrot", "Orange");
		
		Students11 s = new Students11();
		s.StdName("vishnu", "varshini");
		s.stdMark();
	}
}
