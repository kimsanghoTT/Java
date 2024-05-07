package com.kh.InOut;

	//클래스 안에 이름이 다른 클래스를 선언

public class InnerClassOutClass {

	private int 숫자 = 10;
	
	public InnerClassOutClass() {
		// TODO Auto-generated constructor stub
	}
	
	//내부 클래스
	class InnerClass{
		void 밖에서보여주기() {
			System.out.println("숫자보기 : " + 숫자);
		}
	}
	
	public static void main(String[] args) {
		InnerClassOutClass 인아웃 = new InnerClassOutClass();
		InnerClassOutClass.InnerClass 인 = 인아웃.new InnerClass();
		인.밖에서보여주기();
	}
}
