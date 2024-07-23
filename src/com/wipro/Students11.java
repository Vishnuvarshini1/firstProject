package com.wipro;

public class Students11 {
	public void stdMark() {
	int tamil =80;
	int eng =90;
	int total =tamil+eng;
	System.out.println(total);
}
	public void StdName(String fName,String lName) {
		String name=fName + lName;
		System.out.println(name);
	}
	public static void main(String[] args) {
		Students11 s= new Students11();
		s.stdMark();
		s.StdName("vishnu", "varshini");
		//System.out.println(s.StdName("Vishnu", "Varshini"));
		
	}
}
