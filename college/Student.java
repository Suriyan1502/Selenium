package org.college;

public class Student extends Department {
	public void studentName() {
		System.out.println("shyam");
	}
	public void studentId() {
		System.out.println("0026");
	}
	public void studentDep() {
		System.out.println("commerce");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentId();
		std.studentDep();
	}

}
