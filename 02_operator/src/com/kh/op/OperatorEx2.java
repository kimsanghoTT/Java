package com.kh.op;

import java.util.Scanner;

//class 바깥에는 package와 import만 작성 가능
//이외 실행하고자 하는 내용은 class 내부에 작성해줘야함
//메서드 : 특정 상태나 기능을 정리해놓은 집합
public class OperatorEx2 {
	
	//메서드 옆에 있는()는 나중에 어떤 값을 받을 때 사용
	//값을 받을 일이 없으면 빈 공간()으로 유지
	public static void method1() {
		int num1 = 20;
		int num2 = 5;
		int 더하기 = num1 + num2;
		int 빼기 = num1 - num2;
		int 곱하기 = num1 * num2;
		int 나누기 = num1 / num2;
		System.out.println("더하기 :" + 더하기);
		System.out.println("빼기 :" + 빼기);
		System.out.println("곱하기 :" + 곱하기);
		System.out.println("나누기 :" + 나누기);
	}
	
	public static void method2() {
		double num3 = 1.4;
		double num4 = 2.5;
		double 더하기 = num3 + num4;
		double 빼기 = num3 - num4;
		double 곱하기 = num3 * num4;
		double 나누기 = num3 / num4;
		System.out.println("더하기 :" + 더하기);
		System.out.println("빼기 :" + 빼기);
		System.out.println("곱하기 :" + 곱하기);
		System.out.println("나누기 :" + 나누기);
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 숫자를 입력하세요 : ");
		int num1 = sc.nextInt(); 
		//입력한 숫자가 num1으로 들어올 수 있게 변수 선언
		System.out.println("num2 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		//입력한 숫자가 num2로 들어올 수 있게 변수 선언
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("sum : " + sum);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
		sc.close();
	}

	public static void method4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력하기 ↓");
		System.out.print("num1에 실수를 입력하세요 : ");
		double num1 = sc.nextDouble();
		System.out.print("num2에 실수를 입력하세요 : ");
		double num2 = sc.nextDouble();
		
		double sum = num1 + num2;
		double sub = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;
		
		System.out.println("sum : " + sum);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
		sc.close();
	}
	
	public static void main(String[] args) {
		//앞으로 만든 메서드 중에서
		//출력하고 싶은 메서드만 작성할 것
		//method1() 안에 작성한 내용을 출력하고 싶다면
		//method1();
		//작성 후 실행하면 출력 가능
		//method2();
		//method3();
		method4();
	}

}
