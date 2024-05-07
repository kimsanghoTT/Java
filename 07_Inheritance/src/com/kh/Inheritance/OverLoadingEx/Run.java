package com.kh.Inheritance.OverLoadingEx;

public class Run {

	public static void main(String[] args) {

		//main 메서드 : main은 오버로딩 x, 오버라이딩 x
		
		Person person1 = new Person();
		person1.setName("홍길동");
		person1.setAge(30);
		person1.displayInfo();
		
		Person person2 = new Person("박영희");
		person2.setAge(24);
		person2.displayInfo();
		
		Person person3 = new Person("김철수", 20);
		person3.displayInfo();
	}

}
