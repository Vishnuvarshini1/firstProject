package com.wipro;

public class staticvariable {
	 
	int i;//static variable declared

	staticvariable(){
			i++;
			System.out.println(i);
			}


	public static void main(String[] args) {
		
		//System.out.println(i);

		staticvariable o1= new staticvariable();

		staticvariable o2= new staticvariable();

		staticvariable o3= new staticvariable();

	}

}
