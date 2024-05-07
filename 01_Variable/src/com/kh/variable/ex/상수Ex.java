package com.kh.variable.ex;

public class 상수Ex {

	public static void main(String[] args) {
		
	/*	상수 : 한 번 값을 기록하면 값을 바꿀 수 없는 변수
		상수 키워드 : fianl
		상수명 작성 : 대문자로 작성, 연결되는 단어 사이는 '_'로 구분
		상수를 대문자로 표기하는 건 개발자간의 관례적 규칙
		*/
		final double PI = 3.1415926538;
		System.out.println("상수 PI : " + PI);
		
		//MIN = 최소값, MAX = 최대값
		final int MIN = 0;
		final int MAX = 100;
		//상수로 지정된 값을 변경하려하면 에러 발생
		//MIN = 1; 불가
		
		//final을 사용해서 String으로 Hello World 넣기
		
		final String GREETING = "Hello World";
		System.out.println(GREETING);
	}

}
