package com.learn;

public class Encryption extends Mobile{
@Override
public void call() {
	System.out.println("call connected");
}
public void encryprt() {
	System.out.println("Encrypt Message");
}
public static void main(String[] args) {
	Mobile m =new Encryption();
	m.call();
	m.message();
	Mobile.bb();
}
}
