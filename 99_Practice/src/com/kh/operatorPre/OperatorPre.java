package com.kh.operatorPre;
//패키지 : 내가 만든 클래스가 들어있는 폴더 위치
import java.util.Scanner;

public class OperatorPre {
//클래스 : 실행하고자 하는 코드를 작성하는 공간
	public static void practice1() {
	//기본 출력 메서드 - 최종 출력 메서드가 아님
	//최종 메서드에서 호출해 사용할 수 있는 메서드 중 하나
	//static : 메모리에서 고정
		Scanner sc = new Scanner(System.in);
		/*
		System.in : 키보드로 입력받을 수 있게 해주는 출력 시스템
		Scanner : 키보드로 입력받은 내용을 컴퓨터로 출력
		Scanner는 기본으로 갖춰져 있긴 하지만 라이브러리에서 가져와야함
		import를 사용해야함
		스캐너를 불러온 다음에 바로 변수 sc로 스캐너 기능을 불러와도 되지만
		System.out.print를 이용해서 어떤행동을 하는지 확인할 것
		*/
		
		System.out.print("인원 수 : ");
		int human = sc.nextInt();
		System.out.print("사탕의 개수 : ");
		int candy = sc.nextInt();
		
		int div = candy / human;
		int remain = candy % human;
		System.out.println("1인당 사탕의 개수는 " + div + "개 이며, 남은 사탕의 개수는 " + remain +"개 입니다.");
		sc.close();
	}
	
	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		/*
		스캐너로 char값을 입력 받고자 할 경우에는
		charAt을 사용해서 문자열 위치를 읽어오는 작업을 진행해야함
		Scanner/next/charAt()에 위치
		charAt(숫자만 적음) : 숫자는 내가 보고자하는 숫자 위치
		ex) Table -> 총 5글자. 배열 순서로 0번,1번,2번,3번,4번 순서
		따라서 첫 글자 or 맨 앞 글자만 딸 거면 숫자0을 적어야함
		ex)charAt(0) : 맨 앞 글자 보기
		charAt(1) : 두 번째 글자 보기
		*/
		char gender = sc.nextLine().charAt(0);
		//어떤 글자가 들어오든 관계없이 맨 앞글자만 필요 -> 0으로 작성
		System.out.print("성적(소수점 둘째자리까지) : ");
		double testgrade = sc.nextDouble();
		
		gender = (gender == 'M') || (gender == 'm') ? '남' : '여';
		
		//printf는 이어 붙일 때 +가 아니라 ,로 이어 붙임
		//printf로 %f를 출력할 때는 소수점 자리를 지정해줘도 되고
		//지정해주지 않아도 된다
		//만약에 소수점 자리 위치를 지정해서 출력하길 원한다면
		//% . (출력을 원하는 소수점 위치자리값)f
		//ex) 소수점 4번째 자리까지 : %.4f
		
		System.out.println(grade + "학년 " + classNum + "반 " + number + "번 " + name + " " + gender
				+ "학생의 성적은 " + testgrade + "이다.");
		System.out.printf("성적 : %.2f" , testgrade);
		
		sc.close();
		
		/*System. out. print("줄바꿈 없이 가로로 출력")
					   println("다 출력한 다음에 다음줄에서 작성")
					   printf("서식이 지정된 문자열을 출력할 때 작성")
					   %d : 10진수 정수
					   %f : 소수점 수
					   %s : 문자열 출력
					   %c : 문자 하나 출력
					   %b : true or false 출력
					   %x : 16진수 정수
					   %o : 8진수 정수
					   */
	}
	
	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = korean + eng + math;
		double average = /*형변환*/(double) sum /3.0;
		System.out.println("국어점수 : " + korean);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		sc.close();
		
	}
	
	public static void practice4() {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		//true false 값을 표현 받기 위해서는 boolean을 사용
		boolean result = num1 == num2;
		//거짓, 참을 담는 변수 = true or false;
		System.out.println(result);
		sc.close();*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		boolean result = num1 != num2;
		System.out.println(result);
		sc.close();
		
	}
	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
	/*	boolean result1 = num1 == num2;
		boolean result2 = num2 == num3;
		boolean result3 = result1 == result2;*/
		boolean result = num1 == num2 && num1 == num3;
		
		boolean isOR = num1 == num2 || num1 == num3;
		System.out.println(result);
		System.out.println(isOR);
		//System.out.println(num1 == num2 && num1 == num3);
		sc.close();
		// (true) && (true) = true : 그리고. 두 개가 같아야 true아니면 false
		// (false) && (false) = false
		// (true) || (false) = true : 또는. 하나만 true여도 true
		// (false) || (false) = false
	}
	
	
	public static void main(String[] args) {
		//메인 메서드 : 최종으로 실행하는 메서드
		//작성해둔 메서드 중에서 실행이나 출력하고자 하는 메서드 작성
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		practice5();
	}

}
