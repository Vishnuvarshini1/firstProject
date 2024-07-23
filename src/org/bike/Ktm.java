package org.bike;

public class Ktm extends Bike{
@Override	
	public void cost() {
		System.out.println("Cost of ktm bike is:100000");
	}
@Override
	public void speed() {
		System.out.println("Average Speed is: 50km/hour");
}
public static void main(String[] args) {
	Bike k = new Ktm();
	k.cost();
	k.speed();
}
}

