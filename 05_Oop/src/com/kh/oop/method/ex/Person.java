package com.kh.oop.method.ex;

public class Person {

	private String name;
	private int age;
	
	public Person() {}
	//필드 대신 값을 저장하고 내보내는 getter/setter 생성
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
	
	//메인 메서드
	//단축키 main + 컨트롤 + 스페이스바 후 맨 위
	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		//Setter를 활용해서 속성 값 설정
		person1.setName("홍길동");
		person1.setAge(20);
		
		System.out.println("이름 : " + person1.getName());
		System.out.println("나이 : " + person1.getAge());
	}
	
	
	
	
}
