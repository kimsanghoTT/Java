package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitch2 {
	
	
	/* if문을 활용한 예제와 switch를 활용한 예제 */
	public static void ifExam() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 3까지의 숫자 중 하나를 입력");
		int num = sc.nextInt();
		String result;
		System.out.println("if문을 활용한 예제");
		if (num == 1) {
			result = "원";
		}
		else if(num == 2) {
			result = "투";
		}
		else {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(num + "의 영어 발음은 <" + result + ">입니다.");
	}
	
	public static void switchExam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계절 중 하나를 입력해주세요");
		System.out.println("입력 방법 : (봄, 여름, 가을, 겨울) : ");
		String season = sc.nextLine();
		String weather;
		switch(season) {
		case "봄" : 
			weather = "따뜻한 날씨";
			break;
		case "여름":
			weather = "뜨거운 날씨";
			break;
		case "가을":
			weather = "단풍의 날씨";
			break;
		case "겨울":
			weather = "새하얀 날씨";
			break;
		default:
			System.out.println("해당하는 계절이 없습니다.");
			return;
		}
		System.out.println(weather);
		
		
		
	}	
	
	
	
	
	public static void main(String[] args) {
		//if를 활용한 메서드 출력
		// switch를 활용한 메서드 출력
		ifExam();
	}

}
