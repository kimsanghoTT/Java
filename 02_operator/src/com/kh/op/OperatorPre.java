package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	//메인 메서드
	public static void main(String[] args) {
		method1();
	}
	
	//최종적으로 출력하는 메서드는 아님
	//내가 필요할 때 꺼내 쓰는 메서드
	//메서드란? : 특정 상태, 기능을 정리해놓은 집합
	public static void method1(){
	/*public void method1(){ <- 사용시 메인에서method1(); 사용 불가
	static : 고정된이라는 뜻을 가짐
		->자료형 변수에 담아서 쓰는 것이 아니라 
		  단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표시*/
		
	/*	int num1 = 10, num2 = 3;
		double num3 = 2.5, num4 = 3.5;*/
		Scanner sc = new Scanner(System.in);
		/*System.out.println("정수입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수입력 : ");
		int num2 = sc.nextInt();
		System.out.println("실수입력 : ");
		double num3 = sc.nextDouble();
		System.out.println("실수입력 : ");
		double num4 = sc.nextDouble();
		int a = num1 + num2;
		int b = num1 - num2;
		int c = num1 * num2;
		int d = num1 / num2;
		double a2 = num3 + num4;
		double b2 = num3 - num4;
		double c2 = num3 * num4;
		double d2 = num3 / num4;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(c2);
		System.out.println(d2);*/
		

		System.out.println("정수입력 : ");
		int x = sc.nextInt();
		System.out.println("입력한 정수는 3의 정수가 " + (x%3==0));
		sc.close();
	}

}
