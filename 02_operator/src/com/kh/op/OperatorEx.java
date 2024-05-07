package com.kh.op;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		
	//	int a = 1;
	//	int b = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요.");
		System.out.print("a값 입력 : ");
		int a = sc.nextInt();//x는 큰 수
		System.out.print("b값 입력 : ");
		int b = sc.nextInt();//y는 작은 수
		
		System.out.println(a+b);
		
		int sum = a + b;
		System.out.println(sum);
		
		int dif = a - b;
		System.out.println(dif);
		
		int mul = a * b;
		System.out.println(mul);
		
		int div = a / b;
		System.out.println(div);
		

	}

}
