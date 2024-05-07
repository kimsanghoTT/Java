package com.kh.oop.basic;

public class Student {

	//학생의 이름, 나이, 학년 필드
	public String name;
	public int age;
	public int grade;
	
	//생성자 메서드(필수로 작성해야하는 생성자 메서드)
	//필수로 넣어야하는 것 : 이름, 나이, 학년
	public Student(String STname, int STage, int STgrade) {
		this.name = STname;
		this.age = STage;
		this.grade = STgrade;
	}
	
	//출력 메서드 : 정보 출력 메서드
	public void info() {
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n학년 : " + grade);
	}
	
	//메인 메서드
	//학생 객체 생성하기  김철수(18, 3학년) 박영희(20, 2학년)
	//Student student1
	//Studnet student2
	public static void main (String[] args) {
		
		Student student1 = new Student("김철수", 18, 3);
		
		student1.info();
		
		Student student2 = new Student("박영희", 20, 2);
		
		student2.info();
	}
	//학생1,2 정보 출력하기
}
