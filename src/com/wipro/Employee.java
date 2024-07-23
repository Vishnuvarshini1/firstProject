package com.wipro;

public class Employee {
	String empName;
	int empID;
	double empSalary;
	long empPfNo;
	long empPhoneNo;
	//Initialization Method
	public void intializeMethod(String empName,int empID,double empSalary,long pfNo,long phoneNo) {
		this.empName=empName;
		this.empID= empID;
		this.empSalary=empSalary;
		empPfNo=pfNo;
		empPhoneNo=phoneNo;
		System.out.println(this.empName);
		System.out.println(this.empID);
		System.out.println(this.empSalary);
		System.out.println(empPfNo);
		System.out.println(empPhoneNo);	
	}
	public static void main(String[] args) {
		Employee emp =new Employee();
		emp.intializeMethod("varshini", 1234, 25000.00, 3456876123459L, 985673452009L);
		Employee emp1 = new Employee();
		emp1.intializeMethod("vishnu", 9876, 30000.00, 8764573535378L, 9856734288L);
	}
	
}
