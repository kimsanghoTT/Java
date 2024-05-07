package com.kh.conditionEx;

import java.util.Scanner;

//조건문 기능용 클래스
public class ConditionEx {
	
/*	if : 주어진 조건이 참일 때 실행되는 코드 블록
	else : 주어진 조건이 거짓일 때 실행되는 코드 블록(필수 아님)
	
	사용 방법
	if (조건문) {
		조건이 참일 경우 실행할 코드 작성
		만약 참이 아닐경우 자동으로 실행 종료
		
	}
	*/
	
	
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		if(age >=19) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("성인이 아닙니다");
		}
		
	}
	
	public static void method2() {
		
		int num = 2;
		if (num%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}

		
		
	}
	
	public static void method3() {
		// 0~ 13 : 어린이, 14~ : 어린이가 아닙니다
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age =sc.nextInt();
		if(age > 0 && age < 14) {
			System.out.println("어린이입니다.");
		}
		else {
			System.out.println("어린이가 아닙니다.");
		}
	}
	
	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if(age >=10 && age <20) {
			System.out.println("10대입니다.");
		}
		else {
			System.out.println("10대가 아닙니다.");
		}
	}
	
	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if(age >= 80) {
			System.out.println("80세 이상입니다.");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		//method1();
		//method2();
		method3();
		practice1();
		practice2();
		
	}

}
