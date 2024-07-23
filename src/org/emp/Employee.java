package org.emp;
public class Employee {
	public void empId(int id) {
		System.out.println("Employee id :" + id);
	}
	public void empId(int a,int b) {
		System.out.println("Employee id of two employee:" + a + "  "+ b );
	}
	public void empId(double c) {
		System.out.println("Employee id:" +c);
	}
	public void empId(int a,double b) {
		System.out.println("Employee id:" +a +b);
	}
	public void empId(byte a) {
		System.out.println("Employee id:"+ a);
	}
	public void empId(float a) {
		System.out.println("Employee id"+a);
	}
	public void empId(int a,float b) {
		System.out.println("id"+a +b);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId(12);
		e.empId(23, 43);
		e.empId(23.9);
		e.empId(4, 2.8);
		e.empId(12);
		
	}
}
