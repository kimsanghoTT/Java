package com.kh.conditionEx;

public class ControlSwitch {
	
	/*
	 	-switch / case
	 	if문과 비슷하지만 형식이 일정하게 있는 조건 판단문
	 		
	 	-사용 방법
	 	switch(입력 변수) {
	 		case (입력값) : 실행할 문장
	 					  break; // case를 빠져나가기 위한 제어장치
			case (입력값2) : 실행할 문장
						  break; // break가 없다면 다음 case를 실행
	 		.
	 		.
	 		.
	 		default : 입력 변수와 일치하는 값이 없을 때 실행할 문장
	 					else와 비슷. 필수는 아님. 생략 가능
	 				break;
	 	}
		
		-사용 방법 2
			case의 경우 다른 번호가 동일한 결과를 갖길 원한다면
			case를 이어서 작성할 수 있음
		ex) case 1: case 2: case 3:
				System.out.println(결과);
				break;
			default : 
				System.out.println(결과);
			
			break; : 원하는 case를 만나면 문장을 실행한 후
					프로그램을 종료하길 원할 때 사용
					case에 관련된 결과를 실행하기 전에 호출하면 에러발생
		ex) case 1: 
				break;
				System.out.println(결과);
				
				=> 에러 발생
		
		-break와 return의 차이
			
			break : switch, for, while문에서 사용
					해당하는 case이외를 종료
			
			return : 어디서든지 사용 가능
					 값을 반환할 수 있고 메서드의 실행을 중단하고 
					 호출한 곳으로 즉시 전달
					 즉, 메서드 내에서 return이 실행되면
					 그 이후의 코드는 실행되지 않음
		
	 */
	
	
	
	public static void main(String[] args) {
		
		int day = 3;
		String dayString;
		
		switch(day) {
		case 1 : dayString = "일요일";
					break;
		case 2 : dayString = "월요일";
					break;
		case 3 : dayString = "화요일";
					break;
		case 4 : dayString = "수요일";
					break;
		default : dayString = "잘못된 입력";
					break;
		}			
		System.out.println("입력한 숫자의 요일은 : " + dayString);
		
	}

}
