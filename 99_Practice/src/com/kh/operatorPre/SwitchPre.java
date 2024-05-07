package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchPre {
	
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 입력하세요 : ");
		int day = sc.nextInt();
		
		switch(day) {
		
		case 1 : 
			System.out.println("월요일입니다.");
			break;
		case 2 : 
			System.out.println("화요일입니다.");
			break;
		default : 
			System.out.println("아무 요일도 아닙니다.");
		
		}
		
		
	}
	
	public static void method2() {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("번호를 입력하세요 : ");
	int menuNum = sc.nextInt();
	
	switch(menuNum) {
	
	case 1 :
		System.out.println("아메리카노 나왔습니다.");
		break;
	case 2 :
		System.out.println("카페라떼 나왔습니다.");
		break;
	case 3 : 
		System.out.println("흑당버블티 나왔습니다.");
		break;
	default : 
		System.out.println("잘못 입력했습니다. 다시 이용해주세요.");

	}
	
	}	
	
	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("도시이름을 입력하세요 : ");
		String city = sc.nextLine();
		
		switch(city) {
		
		case "서울" : 
			//변수 타입이 String이면 case안의 변수도 String이어야함
			//""로 이루어진 스트링
			System.out.println("대한민국");
			break;
		case "워싱턴 D.C." :
			System.out.println("미국");
			break;
		case "모스크바" :
			System.out.println("러시아");
			break;
		default :
			System.out.println("잘못된 도시 이름입니다.");
		}
		
		
	}
	
	public static void method4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 1: case 2: case 12:
			System.out.println("겨울");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		
		}
	}
	
	public static void method5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A, B, C, D, F 중 하나의 등급을 입력하세요. ");
		char grade = sc.next().charAt(0);
		//charAt()을 호출해서 작성한 문자열 중에 0번째 출력
		switch(grade) {
		case 'A': case 'a':
			System.out.println("4.0");
			break;
		case 'B': case 'b':
			System.out.println("3.0");
			break;
		case 'C': case 'c':
			System.out.println("2.0");
			break;
		case 'D': case 'd':
			System.out.println("1.0");
			break;
		case 'F': case 'f':
			System.out.println("0.0");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	public static void main(String[] args) {
	//	method1();
	//	method2();
	//	method3();
	//	method4();
		method5();
	}

}
