package com.kh.op;

public class OperatorEx6 {

	public static void main(String[] args) {
		
/*	증감 연산자
	+= : 덧셈 연산을 수행하고 결과를 변수의 값을 넣어주는 역할
	
	-= : 뺄셈 연산을 수행하고 결과를 변수의 값으로 넣어주는 역할
		
	이외에도 *=, /=, %=, **==, //== 이 있음
*/	
	
		int num1 = 10;
		int num2 = 5;
		System.out.println("========= [+=] ==========");
		System.out.println("num1 = " + num1 + ", num2 =" + num2);
		num1 += 3;
		System.out.println("num1 += 3을 한 num1의 값: " + num1);
		
		num2 += num1;
		System.out.println("num1의 값 : "+ num1 + ", num2의 값 : " + num2);
	
		int num4 = 10;
		int num5 = 5;
		System.out.println("========= [-=] ==========");
		num4 -=2;
		num5 -= num4;
		System.out.println("num4 : " + num4 + ", num5 :" + num5);
		
	}

}
