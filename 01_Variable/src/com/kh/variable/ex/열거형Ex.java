package com.kh.variable.ex;
/*
	Enum(열거형)
	- 늘어놓아 작성해둔 것을 행함
		-> 변수명들을 나열해놓은 것. 상수(상시적으로 고정된 이름)
	
	- 소비자, 판매자 나눠서 쓸 때
	
	메서드
	- values() : enum에 적어놓은 모든 상수를 배열로 반환
	- valueOf(String 이름) : 이름과 일치하는 enum 상수를 반환
	- ordinal() : enum 상수의 순서를 전달
	- name() : enum 상수의 이름 반환
	- compareTo(enumType e) : 다른 enum 상수와 순서 비교
	- toString() : enum 상수의 문자열 반환
	- getClass() : enum 클래스의 Class 객체 반환
*/	
	
	
	
	
public class 열거형Ex {

	public enum 날짜들{
		월요일,
		화요일,
		수요일,
		목요일,
		금요일,
		토요일,
		일요일
	}
	
	public enum season{ // 상수 나열
		봄, 여름, 가을, 겨울
	}
	

	
	public static void main(String[] args) {
		//각 요일 출력
		System.out.println("월요일 : " + 날짜들.월요일);
		System.out.println("화요일 : " + 날짜들.화요일);
		System.out.println("수요일 : " + 날짜들.수요일);
		System.out.println("목요일 : " + 날짜들.목요일);
		System.out.println("금요일 : " + 날짜들.금요일);
		System.out.println("토요일 : " + 날짜들.토요일);
		System.out.println("일요일 : " + 날짜들.일요일);
		
		season[] 계절 = season.values();
		System.out.println("모든 계절들 : ");
		for(season s : 계절) {
			System.out.println(s);
		}
		
		//valueOf(String 이름) : 이름과 일치하는 enum 상수 반환
		//exception으로 감싸서 없으면 예외처리 진행
		season 봄 = season.valueOf("봄");
		System.out.println("봄과 일치하는 상수 : " + 봄);
		
		//ordianl() : enum 상수의 순서 반환
		System.out.println("봄 상수의 순서 : " + 봄.ordinal());
		
		//name() : enum 상수의 이름 반환
		System.out.println(봄.name());
		
		//compareTo(enumType e) : 다른 enum 상수와 순서 비교
		
		//toString() : values() 처럼 사용 가능
		System.out.println(봄.toString());
		
		//getClass() : 클래스 객체 반환
		System.out.println("클래스의 객체는 : " + 계절.getClass());
		// 계절의 배열을 나타내는 값 나옴
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
