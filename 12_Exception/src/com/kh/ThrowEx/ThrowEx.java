package com.kh.ThrowEx;
/*
	클래스 이름 위치에 작성을 한 번에 해줘서 try catch 작성을 덜어줌
	try - catch문을 작성하거나 throws를 사용해서 예외 처리를 해줌
*/	


public class ThrowEx {

	public ThrowEx() {
		// TODO Auto-generated constructor stub
	}
	public void method() throws Exception{
		
		System.out.println("예외가 발생했습니다");
	}
	
	public static void main(String[] args) throws Exception {
		ThrowEx throwex = new ThrowEx();
		
		throwex.method();
	}
}
