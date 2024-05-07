package com.kh.inheritance.ex;


public class 갤럭시 extends 스마트폰{

	//필드
	private int android;

	//메서드
	//getter setter
	public int getAndroid() {
		return android;
	}

	public void setAndroid(int android) {
		this.android = android;
	}
	
	//기본 생성자
	public 갤럭시() {
		// TODO Auto-generated constructor stub
	}

	//필수 생성자
	public 갤럭시(int android) {
		super();
		this.android = android;
	}
	
	//@Override toString (알트 시프트 s s
	@Override 
	public String toString() {
		return "갤럭시 안드로이드 버전 : " + android + " / " + super.toString();
	}
	
}
