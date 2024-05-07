package com.kh.inheritance.ex;
//자식 클래스
public class 아이폰 extends 스마트폰{

	private int IOS; //아이폰 운영체제

	public int getIOS() {
		return IOS;
	}

	public void setIOS(int iOS) {
		IOS = iOS;
	}
	
	public 아이폰() {
		// TODO Auto-generated constructor stub
	}

	public 아이폰(String 화면, String 통신사, String 성능, int iOS) {
		super(화면, 통신사, 성능);
		this.IOS = iOS;
	}
	
	public String toString() {
		return "아이폰 버전 : " + IOS + " / " + super.toString();
	}
	
}
