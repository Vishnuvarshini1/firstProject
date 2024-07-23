package org.company;

public class CompanyInfo {
	public String companyName(String name) {
		return name;
	}
	public void companyName(String name,String name1) {
		System.out.println("company1"+ " "+name +" "+ "company2" +" "+name1);
	}
	public void companyName(String name1 ,String name2, String name3) {
		System.out.println("company1"+" "+name1 +" " +"company2"+" " +name1 +" "+"company3"+name3);
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		System.out.println(c.companyName("Wipro"));
		c.companyName("Tcs", "Cognizant");
		c.companyName("Zoho", "Sutherland", "KGISL");
	}
	
}
