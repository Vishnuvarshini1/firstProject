package org.phone;

public class Phone {
	public void phoneInfo(String name) {
		System.out.println("Phone Name:"+name);
		
	}
	public void phoneInfo (String name,long Mieinum) {
		System.out.println("phone name: "+name+","+"Phone MieiNum: "+Mieinum);
	}
	public void phoneInfo(long number,String camera) {
		System.out.println("phone number"+number+","+"Phone Camera: Quad Camera"+camera);
	}
	
	public static void main(String[] args) {
		Phone p =new Phone();
		p.phoneInfo("Google pixel 3a");
		p.phoneInfo("Google pixel",346420975253262573L );
		p.phoneInfo(9853453532653L, "Dual");
	}
}
