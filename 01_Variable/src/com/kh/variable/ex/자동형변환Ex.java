package com.kh.variable.ex;

public class 자동형변환Ex {
	// 메인 메서드 (프로그램 실행)
	public static void main(String[] args) {
	/*
		컴퓨터에서 계산을 할 때 값 처리 원칙
		- 같은 자료형끼리 연산, 결과도 같은 자료형끼리 맞춰 나옴
		- 만약 다른 자료형끼리 연산하는 경우 자료형을 변환해서 맞춰야함
		 
		자동 형변환
		 - 연산 시 값의 범위가 작은 자료형을 범위가 큰 자료형으로 변환
		 
	*/
		//자동 형변환
		int num1 = 9;
		long num2 = 10_000_000_000L; // 100억
		
		long result = num1 + num2;
		System.out.println(result);
		//num1이 자동으로 long에 맞춰짐 -> 자동 형변환
		
		/*강제 형변환
			작은 값으로 큰 값을 형변환 하려 한 경우
			cannot convert from long to int 발생
			강제로 형태를 변환해서 넣을 수 있으나
			값이 잘못될 수도 있음*/
		int result1 = (int) (num1 + num2);
		System.out.println(result1);
		
		/* int + long
		 -> long + long 으로 자동 형변환
		 -> 결과도 long
		 그러나 int형 변수에 long을 대입하려고 해서 오류 발생
		 */
	}

}
