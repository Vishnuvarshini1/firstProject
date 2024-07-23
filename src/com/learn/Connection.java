package com.learn;

public class Connection implements Calculation{
	public void call(){
	System.out.println("Connected ");
	}
	
	public void message(){
	System.out.println("Message Received");
	}
	public static void main(String[] args){
	Calculation c = new Connection();
	c.call();
	c.message();
	}
}
