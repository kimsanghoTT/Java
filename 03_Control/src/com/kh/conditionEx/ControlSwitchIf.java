package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {
	
	public static void takeAtaxi() {
		//입력받은 돈이 3000원 이상일 경우 택시를 탈건지 물어볼 것
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보유 금액 : ");
		int money = sc.nextInt();
		
		//if문을 사용해서 3000원 이상일 경우에만 물어보는 코드
		if(money >= 3000) {
			System.out.println("택시를 탈까요? (예/아니오) : ");
			String answer = sc.next();
			
			//answer로 받은 대답에 따라 응답 처리
			switch(answer) {
			case "예" : 
				System.out.println("택시를 탔습니다.");
				break;
			case "아니오":
				System.out.println("택시를 타지 않습니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	
	public static void whyScore() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int Score = sc.nextInt();
		
		if(Score >= 90) {
			System.out.println("A");
		}
		else if(Score >= 80) {
			System.out.println("B");
		}
		else if(Score >=70) {
			System.out.println("C");
		}
		else if(Score >=60) {
			System.out.println("D");
		}
		else {
			System.out.print("재수강 하시겠습니까? (yes/no) : ");
			String answer = sc.next();
			
			switch(answer) {
			case "yes": case "YES":
				System.out.println("재수강 합니다.");
				break;
			case "no": case "NO":
				System.out.println("재수강을 하지 않습니다.");
				break;
			}
		}
	}
	
	public static void whatDay() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘의 요일은 : ");
		System.out.println("(월 / 화 / 수 / 목 / 금 / 토 / 일)");
		String day = sc.next();
		
		switch (day) {
		case "월": case "수": case "금":
			System.out.println("헬스를 할 예정입니다.");
			break;
		case "화": case "목":
			System.out.println("공부를 할 예정입니다.");
			break;
		case "토": case "일":
			System.out.println("주말에 쉴 예정입니까? (예/아니오) : ");
			String answer = sc.next();
			if(answer.equals("예")) {
				System.out.println("네. 집에서 쉴 예정입니다.");
			}
			else {
				System.out.println("어떤 활동을 할 예정인가요");
				System.out.println("1. 등산, 2. 독서, 3. 수영 : ");
				int activity = sc.nextInt();
				switch(activity) {
				case 1:
					System.out.println("등산");
					break;
				case 2:
					System.out.println("독서");
					break;
				case 3:
					System.out.println("수영");
					break;
				default:
					System.out.println("잘못된 입력");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		//takeAtaxi();
		whyScore();
	}

}
