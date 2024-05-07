package com.kh.array;

public class ArrayEx {
	/*
	배열(자료구조)
	- 같은 자료형의 구조를 하나의 묶음으로써 다루는 것
	- 생성된 배열은 index를 이용해서 구분
	- index의 시작 숫자는 0, 마지막 숫자는 (마지막 숫자 -1)
	- 생성된 배열을 활용하기 위해서는 배열을 참조하는 참조형 변수 사용
	* [참조형 변수] : 주소를 저장하는 변수
		- 소문자로 시작하는 자료형(int, double 등)을 제외한
		나머지 모두가 참조형 변수
		- 대표적인 예시 : String
		
	배열의 선언과 생성 방법
	
	- 정수 배열
		
		int[] numbers = new int[5];
		numbers 에는 숫자 5개를 넣을 수 있는 공간이 생성
		
	*/
	
	public static void main(String[] args) {
		//숫자 배열 선언 생성
		int[] numbers = new int[5];
		//int 5라고 하는 것은 
		//index : 0, 1, 2, 3, 4 
		//초기 값 : 0, 0, 0, 0, 0
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		
		numbers[0] = 10;
		
		System.out.println(numbers[0]);
		
		
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//글자 7개 넣을 수 있는 index 생성
		
		String[] str = new String[7];
		
		str[0] = "월";
		str[1] = "화";
		str[2] = "수";
		str[3] = "목";
		str[4] = "금";
		str[5] = "토";
		str[6] = "일";		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		System.out.println(str[5]);
		System.out.println(str[6]);
		
	}
}
