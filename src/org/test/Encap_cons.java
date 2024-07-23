package org.test;

public class Encap_cons {
	private String userName;
	private String userPassword;
	
	Encap_cons(String name,String password){
		this.userName=name;
		this.userPassword=password;
		
	}
	public String getUsername() {
		return userName;
	}
	public String getPassword() {
		return userPassword;
	}
	
}
