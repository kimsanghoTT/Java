package com.kh.variable.ex;

public class 강제형변환Ex {
	
	public static void main(String[] args) {
	/*
		강제 형변환
		1. 값의 범위가 큰 자료형을 작은 자료형으로 변환하는 것
		 	- 데이터 손실을 고려해야함
		2. 의도적으로 자료형을 다른 자료형으로 변환시킬 때 사용
			- 사용 방법
			(자료형) 변수명; : 지정된 자료형으로 변경
			
		
	*/
		//강제 형변환 확인 1
		//자료형 변환 + 데이터 손실
		int num1 = 290;
		//int 4byte를 1byte로 변경
		byte result1 = (byte)num1;
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1); // 34나옴
		
		
	}
}
