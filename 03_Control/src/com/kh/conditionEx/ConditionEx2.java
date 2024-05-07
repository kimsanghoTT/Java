package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {
	/*
	
	if - else if - else
	
	사용 방법
	if(조건1){
		조건1이 참일 경우 실행할 코드 작성
	}
	else if(조건2){
		조건 1이 거짓이고 조건2가 참일 경우 실행할 코드 작성
	}
	else {
		모든 조건이 거짓일 경우 실행할 코드 작성
	}
	
	 */	
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 가진 돈 : ");
		int money = sc.nextInt();
		String result;
		if(money >= 2000) {
			result = "택시를 탄다";
		}
		else if(money >= 1500 && money <=1900) {
			result = "대중교통을 탄다";
		}
		else {
			result = "걸어간다";
		}
		System.out.println(result);
	}
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 나이 : ");
		int age = sc.nextInt();
		String result;
		if(age <= 13) {
			result = "어린이";
		}
		else if(age >13 && age <= 18) {
			result = "청소년";
		}
		else {
			result = "성인";
		}
		System.out.println(result + "입니다.");
	}
	
	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 작성하세요 : ");
		int month = sc.nextInt();
		String result;
		if(month == 1 || month == 2 || month == 12) {
			result = "겨울";
		}
		else if(month >= 3 && month < 6) {
			result = "봄";
		}
		else if(month >= 6 && month < 9) {
			result = "여름";
		}
		else if(month >= 9 && month <12) {
			result = "가을";
		}
		else {
			result = "해당하는 계절이 없습니다.";
		}
		System.out.println(result);
	}
	
	public static void method4() {
		//~13 어린이, 14~18 청소년, 19~ 성인
		
		int age = 15;
		//변수의 기능을 활용해서 마지막에 나이에 따른 표기 출력
		String result; //result 공간만 선언
		if(age <= 13) {
			result = "어린이";
		}
		else if(age >= 14 && age <= 18) {
			result = "청소년";
		}
		else {
			result = "성인";
		}
		System.out.println(result + "입니다.");
	}
	
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		method4();
	}

}
