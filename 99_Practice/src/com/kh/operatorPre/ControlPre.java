package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {
	
	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			}
			else {
				System.out.println("홀수다");
			}
		}
		else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = korean + math + eng;
		double average = sum / 3;
		
		if((korean >= 40 && math >= 40 && eng >= 40) && average >= 60) {
			
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
		
		
		
	}

	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		int day;
		switch(month) {
		case 1: case 3: case 5: case 7: 
		case 8: case 10: case 12: 
			day = 31;		
			break;
		case 4: case 6: case 9: case 11: 
			day = 30;		
			break;
		case 2: 
			day = 28;		
			break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
			return;
			//return : 값을 즉시 반환. 아래 더 있는 문장들을 진행하지 x

		}
		System.out.println(month + "월은 " + day + "일까지 있습니다.");
	}
	
	public static void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m) 입력 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg) 입력 : ");
		double weight = sc.nextDouble();
		double BMI = weight / (height * height);
	
		if(BMI < 18.5) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("저체중");
		}
		else if(BMI < 23) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("정상체중");
		}
		else if(BMI < 25) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("과체중");
		}
		else if(BMI < 30) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("비만");
		}
		else {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("고도 비만");
		}
	}
		
	public static void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int midTest = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finTest = sc.nextInt();
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		
		double midScore = midTest * 0.2;
		double finScore = finTest * 0.3;
		double homeScore = homework * 0.3;
		double evaluation = midScore + finScore + homeScore + attend;
		
		
		if(evaluation >= 70 && attend >= 14) {
			
			System.out.println("=========== 결과 ===========");
			System.out.println("중간 고사 점수(20) : " + midScore);
			System.out.println("기말 고사 점수(30) : " + finScore);
			System.out.println("과제 점수    (30) : " + homeScore);
			System.out.println("출석 점수    (20) : " + attend);
			System.out.println("총점 : " + evaluation);
			System.out.println("PASS");
		}
		else if(evaluation < 70 && attend >= 14) {
			
			System.out.println("=========== 결과 ===========");
			System.out.println("중간 고사 점수(20) : " + midScore);
			System.out.println("기말 고사 점수(30) : " + finScore);
			System.out.println("과제 점수    (30) : " + homeScore);
			System.out.println("출석 점수    (20) : " + attend);
			System.out.println("총점 : " + evaluation);
			System.out.println("Fail [점수 미달]");
		}
		else {
			System.out.println("[출석 횟수 부족 (" + attend + "/20)]");
		}
	}
	
	
	public static void main(String[] args) {
		
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
	}

}
