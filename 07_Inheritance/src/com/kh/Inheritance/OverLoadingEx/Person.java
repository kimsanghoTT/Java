package com.kh.Inheritance.OverLoadingEx;

public class Person {

//필드 : 변수명을 작성해주는 것
	private String name;
	private int age;
	
//메서드 - 특정 행동을 하기위해 묶는 코드
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//기본 생성자 - 오버로딩(똑같은 메서드 이름이지만 안에 있는 매개변수가 다를때 사용)
	public Person() {}
	
//필수 생성자 - 오버로딩(같은 이름(Person)이지만 name이 필수로 들어가길 원하는 메서드)
	public Person(String name) {
		this.name = name;
	
	}
	
//필수 생성자 - 오버로딩(같은 이름이지만 name, age가 필수로 들어가길 원하는 메서드)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
}
