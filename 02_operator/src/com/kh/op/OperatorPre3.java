package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {

	public static void method1() {
		//스캐너로 값을 받고 부등호 처리하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 수 입력 : ");
		int num2 = sc.nextInt();
		
		boolean result1 = num1 < num2;
		boolean result2 = num1 > num2;
		boolean result3 = num1 >= num2;
		boolean result4 = num1 <= num2;
		
		System.out.println("num1 < num2 : " + result1);
		System.out.println("num1 > num2 : " + result2);
		System.out.println("num1 >= num2 : " + result3);
		System.out.println("num1 <= num2 : " + result4);
		sc.close();
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();
		System.out.print("num3 : ");
		int num3 = sc.nextInt();
		
		boolean result1 = (num1 == num2) && (num1 == num3);
		boolean result2 = (num1 != num2) && (num1 == num3);
		boolean result3 = (num1 == num2) || (num1 == num3);
		boolean result4 = (num1 < num2) || (num1 > num3);
		boolean result5 = (num1 >= num2) || (num1 <= num3);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		sc.close();
		
	}
	
	
	public static void main(String[] args) {
		//method1();
		//method2();
		// && : if, while 조건을 체크할 때 
		//두 개의 조건이 모두 만족하는 경우 사용
		// & : 비트 단위 연산으로 특정 비트 패턴을 판단할 때 사용
	}

}
