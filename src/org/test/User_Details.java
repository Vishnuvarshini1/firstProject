package org.test;

public class User_Details  extends Encap_cons{
	User_Details(){
		super("vishnu","23454");
	}
	public static void main(String[] args) {
		User_Details u = new User_Details();
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
	}

}
