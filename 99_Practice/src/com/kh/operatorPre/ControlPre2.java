package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre2 {

	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			return;
		}
	}
	
	public static void practice2() {
		
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
	
	public static void practice3() {
		
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
	
	public static void practice4() {
		
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
	
	public static void practice5() {
		
		final String ID = "myId";
		final String PASSWORD = "myPassword12";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		if(id.equals(ID)) {
			if(password.equals(PASSWORD)) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
	/*	if(id.equals(ID) && password.equals(PASSWORD)) {
	 		System.out.println("로그인 되었습니다.");
		}
		else if(id.equals(ID)){
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else if(password.equals(PASSWORD)){
			System.out.println("아이디가 틀렸습니다.");
		}*/

	//	! : 특정 조건을 부정하는 데 사용
	//	id.equals(ID) : id와 ID가 일치하는지 확인, 일치하면 참
	//	!id.equals(ID) : id와 ID가 일치하지 않으면 참
	
		
	}
	
	public static void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String userRole = sc.nextLine();
		//권한이나 규칙을 설정할 때 자주 사용하는 변수명 : Role
		switch(userRole) {
		
		case "관리자":
			System.out.println("회원관리 \n"
					+ "게시글 관리 \n"
					+ "게시글 작성 \n"
					+ "댓글 작성 \n"
					+ "게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성 \n"
					+ "게시글 조회 \n"
					+ "댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default : 
			System.out.println("잘못된 입력");
		
		}
	}
	
	public static void practice7() {
		
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
	
	public static void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String clac = sc.next();
		double result;
		if(num1 > 0 && num2 > 0) {
			switch(clac) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;				
				break;

			case "/":
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
					return;
				}
				result = (double)num1 / num2;
				break;
			case "%":
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
					return;
				}
				result = num1 % num2;				
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
				
			}
			System.out.println(num1 + " " + clac + " " + num2 + " = " + result);
		}
		else {
			return;
		}
	}

	public static void practice9() {
		
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

	public static void practice10() {
		
		Scanner sc = new Scanner(System.in);
		//System.out.print에서 출력할 내용이 길어져서 줄 바꾸고 싶을때
		// \n : 세로로 줄바꿈해서 출력
		// \r : 키보드 입력하는 위치를 현재 줄의 처음으로 바꿈
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력\r\n"
				+ "2. 짝수/홀수\r\n"
				+ "3. 합격/불합격\r\n"
				+ "4. 달력\r\n"
				+ "5. 로그인\r\n"
				+ "6. 권한 확인\r\n"
				+ "7. BMI\r\n"
				+ "8. 계산기\r\n"
				+ "9. P/F");
		System.out.print("선택 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("잘못된 입력");
		}
	}
	
	
	
	
	public static void main(String[] args) {
	//	practice1();
	//	practice2();
	//	practice3();
	//	practice4();
	//	practice5();
	//	practice6();
	//	practice7();
	//	practice8();
	//	practice9();
	//	practice10();
		
	}

}
