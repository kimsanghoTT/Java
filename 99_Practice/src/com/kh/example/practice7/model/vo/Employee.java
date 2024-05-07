package com.kh.example.practice7.model.vo;

public class Employee {
	
	
	public int empNo;
	public String empName;
	public String dept;
	public String job;
	public int age;
	public char gender;
	public int salary;
	public double bonusPoint;
	public String phone;
	public String address;
	
	public Employee() {}
	public Employee(int number, String name) {
		this.empNo = number;
		this.empName = name;
	}
	public Employee(int number, String name, String dept, String job, 
			int age, char gender, int salary, double bonusPoint, String phone, String address) {
		this.empNo = number;
		this.empName = name;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
		
		
	}
	
/*	public void info1() {
		System.out.println("고용인 번호 : " + empNo + "\n이름 : " + empName);
	}
	public void info2() {
		System.out.println("고용인 번호 : " + empNo + "\n이름 : "
				+ empName + "\n부서 : " + dept + "\n직책 : "
				+ job + "\n나이 : " + age + "\n성별 : " + gender
				+ "\n봉급 : " + salary + "\n보너스 : " + bonusPoint
				+ "\n전화번호 : " + phone + "\n주소 : " + address);
	}*/
}
