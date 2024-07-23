package org.company;

public class Company extends Client {
	public void companyname() {
		System.out.println("Company Name: Cognizant");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.companyname();
		c.clientname();
	}
}
