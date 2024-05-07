package com.kh.oop.method;

public class Student {

	
	private String name;
	private int age;
	private int grade;
	
	public Student() {}
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public int getGrade() {
		return grade;
	}
	
	public void studentInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
		System.out.println("학생 학년 : " + grade);
	}
	
	
	
	public static void main(String[] args) {
		
		Student student1 = new Student("박영수", 15, 2);
		student1.studentInfo();
		Student student2 = new Student("김영희", 17, 1);
		student2.studentInfo();
	}

}
