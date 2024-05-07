package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEx {
	//while문을 사용해서 4번을 누르면 종료되는 프로그램 코드 작성
	
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		int menu;
		
		while(true) {	
			System.out.println("1. 게임하기, 2. 수영하기, 3. 잠자기, 4. 종료");
			System.out.print("프로그램 번호 입력 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("게임을 시작합니다.");
				break;
			case 2:
				System.out.println("수영을 시작합니다.");
				break;
			case 3:
				System.out.println("수면을 취합니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 접근입니다.");
			
			
			}
			
			
		}
		
	}
	
	public static void khCafe() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("kh카페에 오신 것을 환영합니다. \n"
					+ "원하시는 메뉴를 입력해주세요. \n"
					+ "1. 아메리카노 2. 카페라떼 3. 녹차 4. 흑당버블티 5. 주문취소");
		
			String menu = sc.next();
			
			switch(menu) {
			case "아메리카노": case "1":
				System.out.println("아메리카노 주문 추가되었습니다.");
				break;
				
			case "카페라떼": case "2":
				System.out.println("카페라떼 주문 추가되었습니다.");
				break;
				
			case "녹차": case "3":
				System.out.println("녹차 주문 추가되었습니다.");
				break;
			
			case "흑당버블티": case "4":
				System.out.println("흑당버블티 주문 추가되었습니다.");
				break;
			case "주문취소": case "5":
				System.out.println("주문이 취소되었습니다. 다음에 방문해주세요.");
				return;
			
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	public static void getMoney() {
		//커피 10잔, 커피 값 300원
		
		int coffee = 10;
		int money = 300;
		
		//만약에 money가 0보다 더 많다면 커피를 구매하고
		//커피가 다 소진되면 판매를 중지
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 제공");
			//커피가 10잔인데 1잔 제공했다면 -1
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "잔 입니다.");
			//커피가 모두 소진되면 판매 중지
			if(coffee == 0) {
				System.out.println("커피가 소진됐습니다. 판매를 중지합니다.");
				return;
			}
		}
	}

	public static void allNumber() {
		
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++;
		}
	}
	
	public static void treeCutting() {
		
		int attack = 0;
		while(attack < 10) {
			attack++;
			System.out.println("나무를 " + attack + "번 찍었습니다.");
			
			if(attack == 10) {
				System.out.println("나무가 넘어갑니다. 성공");
				return;
			}
		}
	}
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1이상의 정수 하나 입력 : ");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				return;
			}
			else {
				System.out.println("1부터 " + num + "까지의 숫자들");
				int abc = 1;
				while(abc <= num) {
					System.out.println(abc);
					abc++;
				}
			}
		}
		
		
	}
	//사용자로부터 1개의 값을 입력받아 1부터 그 숫자까지의 수를 모두 출력
	//입력한 수는 1이상이어야 함 -> 1미만이면 1 이상의 수를 입력해주세요 출력
	
	public static void getCoffee() {
		//커피가 100원, 돈이 없으면 커피 구매하지 못하는 경우
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카페에 오신 것을 환영합니다.");
		System.out.print("현재 가진 돈을 입력해주세요. : ");
		
		int coffeePrice = 100;
		int money = sc.nextInt();
		
		while(money < coffeePrice) {
			
			System.out.println("잔액이 부족합니다. 충전해주세요.");
			System.out.print("현재 가진 돈을 입력해주세요. : ");
			money = sc.nextInt();
			
		}
		System.out.println("커피를 구매했습니다. 거스름 돈은" 
		+ (money - coffeePrice) + "입니다.");
	}
	
	//10000원 이상 없을 경우 탕수육을 시키지 못하는 예제
	public static void iLovePork() {
		//1. 스태너를 이용해서 금액 입력하기
		//보유하고 있는 금액이 tangsuyuk보다 적으면 잔액이 부족합니다
		//충전해 주세요 출력
		//nextInt()로 다시 입금할 금액 입력
		//10000원 이상이면 주문이 완료되었습니다.
		//잔액 출력
		
		Scanner sc = new Scanner(System.in);
		int tangsuyuk = 10000;
		System.out.print("현재 소지한 금액을 입력해 주세요 : ");
		int myMoney = sc.nextInt();
		
		while(tangsuyuk > myMoney) {
			System.out.println("잔액이 부족합니다. 충전해주세요.");
			System.out.print("충전할 금액을 입력해 주세요 : ");
			myMoney = myMoney + sc.nextInt();
		}
		
		System.out.println("주문이 완료 되었습니다. 잔액은 "
		+ (myMoney - tangsuyuk) + "원 입니다.");
		
		
	}
	
	//public : 어디서든 접근 가능함(전체 공개)
	//protected : 같은 패키지 안에서만 접근이 가능
	//default : 같은 패키지 안에서 protected보다 제한적으로 접근 가능
	//private : 한 클래스 안에서만 접근 가능
	
	//void : 반환하는 것 없이 바로 출력이 될 때 사용
	
	public static void main(String[] args) {
		
	//	method1();
	//	khCafe();
	//	getMoney();
	//	allNumber();
	//	treeCutting();
	//	method2();
	//	getCoffee();
		iLovePork();
		
	}

}
