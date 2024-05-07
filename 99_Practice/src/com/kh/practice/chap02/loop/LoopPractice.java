package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void Greeting() {
		System.out.println("하이요");
		//Greeting : 하이요 인사를 출력하는 메소드
	}
	
	public void Greeting2() {
		System.out.println("곤방와");
	}

	public static void practice1() {
		int num;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1이상의 정수 하나 입력 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1이상의 정수를 입력해주세요.");
				return;
			}
			else {
				break;
			}		
		}
		System.out.println("1부터 " + num + "까지의 숫자들");
		int abc = 1;
		while(abc <= num) {
			System.out.println(abc);
			abc++;
		}
	}
	
	public static void practice2() {
		int num;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1이상의 정수 하나 입력 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1이상의 정수를 입력해주세요.");
			}
			else {
				break;
			}		
		}
		System.out.println("1부터 " + num + "까지의 숫자들");
		int abc = 1;
		while(abc <= num) {
			System.out.println(abc);
			abc++;
		}
	}
	
	public static void practice3() {
		int num;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1이상의 정수 하나 입력 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1이상의 정수를 입력해주세요.");
				return;
			}
			else {
				break;
			}		
		}
		System.out.println("1부터 " + num + "까지의 숫자들");
		int abc = 1;
		while(abc <= num) {
			System.out.println(num);
			num--;
		}
	}
	
	public static void practice4() {
		int num;
		Scanner sc = new Scanner(System.in);
	/*	while(true) {
			System.out.print("1이상의 정수 하나 입력 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1이상의 정수를 입력해주세요.");
			}
			else {
				break;
			}		
		}
		System.out.println("1부터 " + num + "까지의 숫자들");
		int abc = 1;
		while(abc <= num) {
			System.out.println(num);
			num--;
		}*/

		//do-while 조건이 참이 아니어도 최초 1회는 실행
		do {
			System.out.println("1이상의 정수 하나 입력 : ");
			num = sc.nextInt();
			//1미만의 숫자가 들어오면
			if(num < 1) {
				System.out.println("1이상의 정수를 입력해주세요.");
				//조건에 관게없이 do로 인해 무조건 1회 실행되기 때문에 return
				//을 작성해주지않아도 됨
			}
			else {
				break;
			}

		}while (num >= 1);
		//1보다 커서 밑으로 내려온다면 num부터 1까지 내려오는 for문 작성
		for(int i = num; i >= 1; i--) {
			System.out.println(i + " ");
		}
		
	
	}
	
	public static void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
			if(i<num) {
				System.out.print(i + " + ");
			}
			else if(i == num){
				System.out.print(i + " = ");
			}

		}
		System.out.println(sum);

	}
	
	public static void practice6() {
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			
			if(num1 < 1 || num2 < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				return;
			}
			else {		
				break;
			}
			
		}
		if(num1 < num2) {
			while(num1 <= num2) {
				System.out.println(num1);
				num1++;
			}
		}
		else {
			while(num1 >= num2) {
				System.out.println(num2);
				num2++;
			}
		}
	}	
	
	public static void practice7() {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
	/*	while(true) {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			
			if(num1 < 1 || num2 < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
				
			}
			else {		
				break;
			}
			
		}
		if(num1 < num2) {
			while(num1 <= num2) {
				System.out.print(num1 + " ");
				num1++;
			}
		}
		else if(num1 >= num2){
			while(num1 >= num2) {
				System.out.println(num2 + " ");
				num2++;
			}
		}*/
		System.out.print("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		num2 = sc.nextInt();
		if(num1 >= 1 && num2 >= 1) {

			int Min = Math.min(num1, num2);
			int Max = Math.max(num1, num2);
			//가장 작은 값을 찾는 min 메서드, 알아서 비교하게 하기
			//괄호 안의 숫자 순서는 상관없음
			//Random과 math.random의 차이 :
			//math.random보다 Random에 있는 랜덤기능이 더 많음
			//다만 사용에 큰 차이는 없음
			for(int i = Min; i <=Max; i++) {
				System.out.print(i + " ");	
				
		}
				
		}
		else {
			System.out.println("1이상의 정수를 입력해주세요.");
		}
	}
	
	public static void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.println("===== " + dan + "단 =====");
		for(int i = 1; i<=9; i++) {
			
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	public static void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		if(dan > 9) {
				System.out.println("1부터 9까지의 숫자를 입력해주세요");
			}
		for(int num = dan; num <= 9; num++) {

			System.out.println("===== " + num + "단 =====");
			for(int i = 1; i<=9; i++) {
				
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		}
	}
	
	public static void practice10() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			if(dan > 9) {
					System.out.println("1부터 9까지의 숫자를 입력해주세요");
				}
			for(int num = dan; num <= 9; num++) {
	
				System.out.println("===== " + num + "단 =====");
				for(int i = 1; i<=9; i++) {
					
					System.out.println(num + " * " + i + " = " + (num * i));
				}
			}
		}
	}
	
	public static void practice11() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
		int gap = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(startNum);
			startNum += gap;
		}
	}
	
 	public static void practice12() {
		
		Scanner sc = new Scanner(System.in);
		String operator;
	
		while(true) {
			System.out.println("프로그램 종료를 원할시 exit 입력");
			System.out.print("연산자(+, -, *, /, %) : ");
			operator = sc.next();
			if(operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			int result = 0;
			if(operator.equals("+")) {
				result = num1 + num2;
			}
			else if(operator.equals("-")) {
				result = num1 - num2;
			}
			else if(operator.equals("*")) {
				result = num1 * num2;
			}
			else if(operator.equals("/")) {	
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
				result = num1 / num2;	
			}
			else if(operator.equals("%")) {
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
				result = num1 % num2;
				
			}
			else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요");
				continue;
			}
			System.out.println(num1 + " " + operator + " " + num2
					+ " = " + result);
			
			// break : 중괄호 탈출
			// continue : 다음 반복 실행
		}
	}

 	public static void practice13() {
 		
 		Scanner sc = new Scanner(System.in);
 		System.out.print("정수 입력 : ");
 		int star = sc.nextInt();
 		
 		for(int i = 1; i <= star; i++) {
 			for(int j = 0; j < i; j++) {
 				System.out.print("* ");
 			}
 			//줄바꿈을 해줄 enter역할
 			System.out.println(" ");
 		}
 
 	}
 	
 	public static void practice14() {
 		
 		Scanner sc = new Scanner(System.in);
 		System.out.print("정수 입력 : ");
 		int num = sc.nextInt();
 		
		for(int line = num; line > 0; line--) {
 			for(int star = 1; star <= line; star++) {
 				System.out.print("* ");
 			}
 			System.out.println(" ");
 		}
 	}
 	
 	public void practice15() {
 		
 		Scanner sc = new Scanner(System.in);
 		System.out.print("정수 입력 : ");
 		int size = sc.nextInt();
 		//line = 세로로된 줄의 번호
 		for(int line = 0; line < size; line++) {
 			for(int blank = 0; blank < line; blank++) {
 				//blank = 공백을 출력하기 위한 for문
 				//line번째 줄(0~4)에서는 line개(0~4)의 공백을 출력
 				System.out.print(" ");
 			}
 			
 			for(int star = size; star > line; star--) {
 				//line번째 줄에서는 size(5) - line(0~4)개의 별을 출력
 				System.out.print("*");
 			}
 			
 			System.out.println(" ");
 		}
 		
 		
 	}
 	
 	
 	
}
