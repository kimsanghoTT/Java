package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	public void menu() {
		
		System.out.println("간식 생성기");
		
		System.out.print("간식의 종류 : ");
		String kind = sc.next();
		
		System.out.print("간식의 이름 : ");
		String name = sc.next();
		
		System.out.print("간식의 맛 : ");
		String flavor = sc.next();
		
		System.out.print("간식의 개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("간식의 가격 : ");
		int price = sc.nextInt();
		
		//저장 변수
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		System.out.print("저장된 내용을 확인하시겠습니까?(Y/N)");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("Y")) {
			System.out.println(scr.confirmData());
		}
		//eqaulsIgnoreCase : 대소문자 상관없이 두 문자열을 비교
		
		
	}
	
}
