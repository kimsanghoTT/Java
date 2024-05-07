package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
			//1. 지정 문자열 ➔ tokenMenu()
			System.out.println("1. 지정문자열");
			//2. 입력 문자열 ➔ inputMenu()
			System.out.println("2. 입력문자열");
			//3. 프로그램 끝내기 ➔ “프로그램을 종료합니다” 출력 후 종료
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : 
				tokenMenu();
				break;
			case 2 :
				inputMenu();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
		
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 글자 개수 : " + str.length());
		
		String newStr = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + newStr);
		System.out.println("토큰 처리 후 글자 개수 : " + newStr.length());
		System.out.println("모두 대문자로 변환 : " + newStr.toUpperCase());
	}
	
	public void inputMenu() {
		//첫 글자 대문자와 찾을 문자 몇 개 있는지 출력
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println("첫 글자 대문자 : " + tc.firstCap(str));
		System.out.println("찾을 문자를 하나 입력하세요 : ");
		char ch = sc.next().charAt(0);
		System.out.println(ch + "문자가 들어간 개수 : " + tc.findChar(str, ch));
	}
}
