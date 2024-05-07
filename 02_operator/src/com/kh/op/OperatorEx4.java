package com.kh.op;

public class OperatorEx4 {

	public static void main(String[] args) {
		
	/*	비교 연산자
		 - 데이터가 같은지 다른지를 비교할 때 사용
		 - 결과는 항상 true, false로 나타남
		
		 사용 방법
		 1. a == b : a와 b가 같으면 true
		 			 a와 b가 다르면 false
		 			 
		 2. a != b : a와 b가 다르면 true
		 			 a와 b가 같으면 false
		 
		 ! : 부정할 때 사용하는 연산자
		 == : 같을 때 사용하는 연산자
	*/
		int a = 10;
		int b = 10;
	/*	system.out.println으로 무언가를 출력할 때
		 + 는 "" 문자열이 있으면 각 각의 값을 이어주는 역할을 함
		때문에 문자열이 들어간 출력 텍스트에서 
		연산(+,-,*,/,true,false)같은 작업을 진행하기 위해선 
		우선순위인 1인 괄호()를 이용해서 연산작업으로써 우선 진행시킨다.
		그 이후에 연산결과를 문자열과 이어 붙인다.*/
		System.out.println("a == b인가? : " + (a==b));
		System.out.println(a==b);
		
		
		// a = 10, b = 10
		int c = 20;
		int d = 10;
		
		System.out.println(c != d);
		
		//1. a가 10이고 c 20일 때 ==를 썼을 경우
		System.out.println("a == c ↓");
		System.out.println(a == c); //false
		
		
		
	}

}
