package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhile {
	
	/*	while(조건식) : 끝이 확실하지 않은 반복에 사용
		
		while(조건식) {
			조건식이 참일 경우에 실행
		}
		조건식이 거짓일 경우엔 실행 종료
		
		예제 코드 1:
		while(true) {
			System.out.println("무한 반복");
		}
		예제 코드 2:
		while(false) {
			System.out.println("실행하지 못한 채 종료");
		}
		*/
	
	public static void inLoop() {
		
		while(true) {
			System.out.println("무한 실행");
		}
	}
	
	public static void outLoop() {
		
	/*	while(false) {
			System.out.println("실행 안됨");
		}*/
	}
	
	public static void whileLoop() {
		
		int i = 1;
		
		while(i < 5) {
			//조건이 참일 때 실행할 코드
			System.out.println("i의 값: " + i);
			i++;
		}
	}
	
	public static void whileLoopEx() {
		//스캐너 활용해서 키보드 값 입력 받기
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("1. 실행, 2. 종료");
			System.out.print("원하는 숫자 입력 : ");
			int i = sc.nextInt();
			
			switch(i) {
			
			
			case 1: 
				System.out.println("프로그램을 실행합니다.");
				break;
			case 2:
				System.out.println("프로그램을 종료합니다.");
				//break;
				return;
				//break와 return 모두 case를 탈출하는 구문이기 때문에
				//같이 사용 불가
				//break의 경우 조건문이 참이라면 while이 종료되지 않고 반복
				//return의 경우 조건문이 참이여도 while코드를 탈출해서 종료
			default:
				System.out.println("잘못된 번호. 다시 입력해주세요.");

			}
		}

		

	}
	
	
	public static void main(String[] args) {
		//최종으로 실행하는 메인 메서드
	//	inLoop();
	//	whileLoop();
		whileLoopEx();
	}

}
