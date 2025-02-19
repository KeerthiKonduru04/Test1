package org.college;

public class Student extends College{
	public void studentName()
	{
		System.out.println("The Student Name is Keerthi");
	}
	public void studentDept()
	{
		System.out.println("The Department is ECE");
	}
	public void studentId()
	{
		System.out.println("The Student Id  is 123");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.hostelName();
		s.deptName();
		

	}
}
