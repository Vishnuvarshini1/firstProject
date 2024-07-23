package org.college;

public class Student extends College{
	public String studentName(String stdname) {
		return stdname;
	}
	public String studentDept(String stddept) {
		return stddept;
	}
	public int studentId(int stdId) {
		return stdId;
	}
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.studentName("Varshini"));
		System.out.println(s.studentDept("CSE"));
		System.out.println(s.studentId(2345));
		System.out.println(s.collegeName("Sri krishna"));
		System.out.println(s.collegeCode(8975));
		System.out.println(s.collegeRank(5));
		s.hostelName();
		s.deptName();
		
	}
}
