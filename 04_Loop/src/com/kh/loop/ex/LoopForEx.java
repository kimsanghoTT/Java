package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {
	
	

	public void guguDan() {

		//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 세계로 오신 것을 환영합니다.");
		
		//0을 입력하기 전까지 반복해서 출력하기
		//반복하기 위해 while 사용
		
		while(true) {
			System.out.println("종료를 원하면 0 입력하기");
			System.out.print("숫자 입력 : ");
			int dan = sc.nextInt();
			if(dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			for(int i = 1; i<=9; i++) {
				System.out.println(dan + " X " + i + " = " + (dan * i));
			}
		}
		
	}
	
	public void guguDan2() {
		//스캐너로 값 받기
		//int dan = sc.nextInt();
		//for문으로 9번부터 1번까지 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 세계로 오신 것을 환영합니다.");
		
		while(true) {
			System.out.println("종료를 원하면 0 입력하기");
			System.out.print("숫자 입력 : ");
			int dan = sc.nextInt();
			if(dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(dan<1 || dan > 9) {
				System.out.println("1부터 9까지의 숫자를 입력해주세요");
				continue;//건너뛰고 계속 실행하기
			}
			for(int i = 9; i>= 1; i--) {
				System.out.println(dan + " X " + i + " = " + (dan * i));
			}
		}
	}

	public void guguDan3() {
		
		for(int dan = 1; dan <= 9; dan++) {
			System.out.println("***** " + dan + " *****");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			
		}
	}
	
	public void guguDan4() {
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("***** " + dan + " *****");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			
		}
	}
	
	public void ramdomNumber() {
		//10개의 숫자를 랜덤으로 출력
		Random ran = new Random();
		System.out.print("범위 입력 : ");
		int ranNum = ran.nextInt();
		//nextInt()안에 숫자를 넣어서 어디서부터 어디 사이에 랜덤으로
		//숫자가 나와야하는지 범위를 지정할 수 있음
		//nextInt(5) : 0~4사이의 숫자가 나옴
		//숫자를 셀 때 코드 안에서는 0부터 시작하기 때문
		//랜덤으로 지정한 숫자 -1
		
		for(int i = 1; i<=3; i++) {
			int randomNumber = ran.nextInt(10) + 1;
			System.out.println("랜덤 숫자 " + i + " : " + randomNumber);
		}
		
		
		
	}
	//랜덤으로 1~10사이의 숫자 3개 출력하기
	public void randomFor() {
		Random ran = new Random();
		
		for(int i = 1; i<=3; i++) {
			int randomNumber = ran.nextInt(10) + 1;
			//nextInt(10) : 0~9이므로 +1하면 1~10
			System.out.println("랜덤 숫자 " + i + " : " + randomNumber);
		}
		
	}
	
	public void randomFor2() {
		//랜덤으로 1 ~ 45개 번호 6자리 for문 사용해서 출력
		
		Random ran = new Random();
		
		for(int i = 1; i <= 6; i++) {
			int randomNumber = ran.nextInt(45) + 1;
			//if 랜덤 숫자가 같다면 번호를 제외하고 출력하기
			System.out.println("랜덤 숫자 " + i + " : " + randomNumber);
		}
	}
	
	//홀수만 출력하기
	public void oddNum() {
		for(int num = 1; num <= 10; num++) {
			if(num % 2 != 0) {
				System.out.println(num);
			}
		}
	}
	
	//짝수만
	public void evenNum() {
		
		for(int num = 1; num<=10; num++) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
	
	//정사각형 모양의 별 출력
	public void squareStar() {
		int star = 3;
		for(int i = 0; i < star; i++) {
			for(int j = 0; j<star; j++) {
				System.out.print("* ");
			}
			
			System.out.println("");//가로로 별을 출력한 다음 줄바꿈
		}
		
		
	}
	
	//정사각형 모양의 별 출력 가로로 5개
	public void fiveStar() {
		int star = 5;
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	//랜덤으로 만들어진 숫자가 무엇인지 맞추는 게임
	public void numberGame() {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		while(true) {	
			int ranNumber = ran.nextInt(4) + 1; // 1~3
			int i = 2;
			while(i >= 1) {	
				System.out.print("공격을 시도합니다. (숫자 적기) : ");
				int guest = sc.nextInt(); // 게스트가 입력한 숫자 가져옴
				
				if(guest == ranNumber) {
					System.out.println("정답입니다.");
						
				}
				else if(guest > ranNumber) {
					System.out.println("숫자가 너무 큽니다.");
					i--;
				}
				else if(guest < ranNumber) {
					System.out.println("숫자가 너무 작습니다.");
					i--;
				}
							
				
			}
			System.out.println("게임을 다시 시작하시겠습니까? (1번 yes / 2번 no)");
			int playAgain = sc.nextInt();
			if(playAgain == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
		}
	}
	/*	Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		while(true) {
			int randomNumber = ran.nextInt(3) + 1;
			System.out.println("숫자를 맞춰보세요.");
			for(int attack = 1; attack <=2; attack++) {
				System.out.println("공격을 " + attack + "회 시도합니다. (숫자 적기) : ");
				int guest = sc.nextInt();
				
				if(guest == randomNumber) {
					System.out.println("정답입니다.");
					break;
				}
				else if(guest < randomNumber) {
					System.out.println("정답보다 작습니다.");
				}
				else if(guest > randomNumber) {
					System.out.println("정답보다 큽니다.");
				}
			}
			System.out.println("게임을 다시 시작하시겠습니까? (1번 yes / 2번 no)");
			int playAgain = sc.nextInt();
			if(playAgain == 2) {
				System.out.println("게임을 종료합니다.");
				break;
		}
	}
	}*/
}
