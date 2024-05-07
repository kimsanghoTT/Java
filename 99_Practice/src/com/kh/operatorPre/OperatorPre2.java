package com.kh.operatorPre;

import java.util.Scanner;

public class OperatorPre2 {

	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num >0) {
			System.out.println("양수다");
		}
		else {
			System.out.println("양수가 아니다");
		}
	}

	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}
		else if(num == 0) {
			System.out.println("0이다");
		}
		else {
			System.out.println("음수다");
		}
	}
	
	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다");
		}
		else {
			System.out.println("홀수다");
		}
	}
	
	public static void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candies = sc.nextInt();
		
		int candiesPer = candies / person;
		int remain = candies % person;
		
		System.out.println("1인당 사탕 개수 : " + candiesPer);
		System.out.println("남는 사탕 개수 : " + remain);
		
	}
	
	public static void practice5() {
		
		Scanner sc = new Scanner(System.in);
	}
	

	public static void practice8() {
	//주민번호를 이용해서 남자인지 여자인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String idNum = sc.next();
		char genderCode = idNum.charAt(7);
		String gender; //남자인지 여자인지 결과 보여주기
		if(genderCode == '1' || genderCode == '3') {
			gender = "남자";
			
		}
		else if(genderCode == '2' || genderCode == '4') {
			gender = "여자";
			
		}
		else {
			System.out.println("잘못된 주민번호");
			return;
			//1. gender = "잘못된 주민번호"
			//2. else에서 돌려보내는 return;
		}
		System.out.println(gender);
				
	}
	
	public static void castingPractice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		int unicode = inputChar;
		//char = 2byte, int = 4byte
		System.out.println("입력한 문자는 " + inputChar + "의 유니코드는 " + unicode + "입니다.");
		
		//* 유니코드 : 글자에 숫자를 붙여서 컴퓨터가 읽을 수 있도록 해주는 방식
	}

	public static void castingPractice3() {
		//주어진 코드에서 빈칸을 채우고 출력 결과가 나오도록 만든 것
		
		int iNum = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum/iNum2); //2
		System.out.println((int)dNum); //2
		System.out.println((double)dNum * iNum2); //10.0
		//작은 값과 큰 값이 만나면 자동으로 큰 값으로 변환되기 떄문에
		//double은 필수가 아님
		System.out.println((double)iNum); //10.0
		System.out.println((double)iNum/iNum2); //2.5
		System.out.println(dNum);//2.5
		System.out.println((int)fNum);//3
		System.out.println((int)(iNum / fNum)); //3
		//int와 float은 같은 크기의 byte. ->정수인지 실수인지 표기
		System.out.println(iNum / fNum); //3.3333333
		//float은 소수점 이하 6자리까지만 보여줌
		System.out.println((double)iNum / fNum); //3.333333333335
		System.out.println(ch); //A
		System.out.println((int)ch); //65
		System.out.println(ch + iNum); //75
		//int가 더 큰 크기이므로 ch가 int로 자동 변환됨
		System.out.println((char)(ch +iNum)); //K
	}
	
	/* 표기법
	 코드를 작성할 때 개발자 사이에 코드를 보기 편하게 하기위한 룰
	 
	 1. 스네이크 케이스
	 변수명에 언더바가 들어있는 표현방식
	 ex) snake_case
	 
	 2. 파스칼 케이스
	 첫 글자와 중간 글자들이 대문자로 사용하는 표현방식
	 ex) PascalCase
	 	 GenderCode
	 
	 3. 카멜 케이스
	 중간 글자만 대문자로 시작해서 표현하는 방식
	 ex) camelCase
	 
	 4. 케밥 표기법
	 중간에 대시(-)로 구분해서 변수명을 작성하는 방식
	 ex) kebab-case
	 
	 */
	
	
	public static void main(String[] args) {
	//	practice1();
	//	practice2();
	//	practice3();
		practice4();
	//	practice5();
	//	practice6();	
	//	practice8();
	//	castingPractice1();
	//	castingPractice3();
	}

}
