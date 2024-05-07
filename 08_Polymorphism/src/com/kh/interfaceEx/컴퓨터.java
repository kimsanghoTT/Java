package com.kh.interfaceEx;
/*
	클래스, 추상 클래스를 상속 받는 명령어 : extends
	인터페이스 상속 받는 명령어 : implements

	추상클래스 : 미완성된 값을 가지고 변경, 확장하는게 목표
	인터페이스 : 정해진 값을 가지고 클래스를 완성하는게 목표

*/
public class 컴퓨터 implements 기계{
	
	//기계 인터페이스에 미완성(abstract)된 메서드를 컴퓨터로 가지고와서
	//미완성된 모든 메서드를 완성시켜주면 class에 표시된 에러가 사라짐
	public void 전원켜기() {
		System.out.println("컴퓨터의 전원 버튼을 눌러서 킨다.");
	}
	
	public void 전원끄기() {
		System.out.println("컴퓨터의 전원 버튼을 눌러서 끈다.");
	}
	
}
