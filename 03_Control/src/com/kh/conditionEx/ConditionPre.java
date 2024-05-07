package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 입력 :");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 입력 :");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("숫자 두 개가 같습니다.");
		}
		else {
			System.out.println("숫자 두 개가 다릅니다.");
		}
	}
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 1 입력 : ");
		String str1 = sc.nextLine();
		System.out.print("문자열 2 입력 : ");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("문자열 두 개가 같습니다.");
		}
		else {
			System.out.println("문자열 두 개가 다릅니다.");
		}
	}
	
	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 1 입력 :");
		double num1 = sc.nextInt();
		System.out.print("실수 2 입력 :");
		double num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("같은 실수입니다.");
		}
		else {
			System.out.println("서로 다른 실수입니다.");
		}
	}
	
	
	public static void main(String[] args) {

	}

}
