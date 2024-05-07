package com.kh.op;

import java.util.Scanner;

public class OperatorPre2 {
	
	public static void method1() {
		//스캐너 + 비교 연산자
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println("b의 값을 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.println("a : " + a + ", b : " + b);
		System.out.println("a와 b가 같으면 true, 다르면 false");
		System.out.println("a == b : " + (a==b));
		System.out.println("a와 b가 다르면 true, 같으면 false");
		System.out.println("a != b : " + (a!=b));
		sc.close();
		
	}
	public static void method2() {
		//스캐너 + 증감연산자 + 비교연산자
		Scanner sc = new Scanner(System.in);
		System.out.print("x에 들어갈 값은 : ");
		int x = sc.nextInt();
		System.out.print("y에 들어갈 값은 : ");
		int y = sc.nextInt();
		int z = ++x;
		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
		System.out.println("x == y : " + (x==y));
		System.out.println("x == z : " + (x==z));
		int f = ++x;
		System.out.println("x : "+ x + ", f : " + f);
		sc.close();
	}
	public static void method3() {
		//인원 수와 사탕 개수를 입력 받기
		//1인당 동일하게 나눠가진 사탕의 개수와 남은 사탕의 개수 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수를 입력 :");
		int human = sc.nextInt();
		
		System.out.println("사탕 파티에 " + human + "명이 참가했습니다.");
		System.out.print("현재 보유한 사탕의 개수를 입력 : ");
		int candy = sc.nextInt();
		System.out.println("현재 가지고 있는 사탕은 " + candy +"개 입니다.");
		
		int div = candy / human;
		int remain = candy % human;
		System.out.println("따라서 모두 동일하게 가질 수 있는 사탕의 수는 " + div + "개 이며, 나머지로 " + remain + "개가 남습니다.");
		sc.close();
	}
	
	
	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
	}

}
