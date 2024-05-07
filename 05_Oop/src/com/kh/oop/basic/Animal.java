package com.kh.oop.basic;

public class Animal {
	
	//필드 이름 나이
	public String name;
	public int age;
	
	//초기생성자
	public Animal() {}
	//필수생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//출력메서드
	public void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
		
	}
	
	//메인메서드
	public static void main(String[] args) {
		
		Animal dog = new Animal();
		
		dog.name = "삐삐";
		dog.age = 4;
		dog.info();
		
		Animal cat = new Animal("나비", 5);
		
		cat.info();
	}
}
