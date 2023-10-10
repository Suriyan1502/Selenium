package org.college;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println(id);
		System.out.println(name);
	}
	public void getStudentInfo(String email,int phone_number) {
		System.out.println(email);
		System.out.println(phone_number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std=new Students();
		std.getStudentInfo(01);
		std.getStudentInfo(02, "naresh");
		std.getStudentInfo("abc@gmail.com", 325429121);
	}

}
