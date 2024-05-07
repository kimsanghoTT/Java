package com.kh.op;

public class OperatorEx5 {

	public static void main(String[] args) {
	/*	
		-비교 연산자
		== : 서로 같으면 true, 다르면 false
			ex) 1 == 1 = true
		!= : 서로 다르면 true, 같으면 false
			ex) 1 != 1 = false
		a > b : a가 b보다 클 때 true
		a <	b : a가 b보다 작을 때 true
		a >= b : a가 b보다 크거나 같을 때 true
		a <= b : a가 b보다 작거나 같을 때 true
		
		
		-논리 연산자
		&& : 두 개의 조건이 모두 참일 경우 true, 나머지 모든 경우 false
			ex) (1 == 1) && (3 == 3) = true
				(1 == 3) && (3 == 3) = false
				(1 == 3) && (3 == 5) = false
		|| : 두 개의 조건 중 하나라도 참일 경우 true
			ex) (1 == 1) || (3 == 5) = true
				(3 == 5) || (1 == 3) = false
				(1 == 1) || (3 == 3) = true
	*/
		
		int num1 = 10;
		int num2 = 20;
		
		boolean result1 = num1 == num2;
		boolean result2 = num1 != num2;
		boolean result3 = num1 < num2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		
		
	}
}
