package org.edu;

public class Arts extends Education{
	public void bsc() {
		System.out.println("Arts Branch: Bsc");
	}
	public void bEd() {
		System.out.println("Arts Branch: bEd");
		
	}
	public void ba() {
		System.out.println("Arts Branch:BA ");
	}
	public void bBA() {
		System.out.println("Arts Branch: bBA");
	}
	@Override
	public void ug() {
		System.out.println("Under Graduation Elligible age is 18 and above");
	}
	@Override
	public void pg() {
		System.out.println("To purse PG student must completed UG");
	}
	public static void main(String[] args) {
		Education e = new Arts();
		Arts a= new Arts();
		a.bsc();
		a.bEd();
		a.bBA();
		a.ba();
		e.ug();
		e.pg();
	}
}
