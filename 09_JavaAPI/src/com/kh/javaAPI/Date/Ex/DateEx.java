package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
	Date : 특정 날짜와 시간을 나타내는 클래스
	Calendar : 날짜와 시간을 조작하는데 사용되는 추상클래스
	GregorianCalender : 그레고리력을 사용해서 날짜와 시간을 계산
	SimpleDateFormat : 날짜와 시간을 형식으로 보여주고 출력
	
	*/
public class DateEx {

	public static void main(String[] args) {
		//1. Date
		Date 현재데이트 = new Date();
	//	System.out.println(현재데이트);
		
		//2. Calender
		Calendar 달력 = Calendar.getInstance();
		//년 월 일
		int year = 달력.get(Calendar.YEAR);
		int month = 달력.get(Calendar.MONTH); //0월부터 가져오기 떄문에 +1 해줘야함
		int day = 달력.get(Calendar.DAY_OF_MONTH);
		
	//	System.out.println("현재 날짜 : " + year + "/" + (month+1) + "/" + day);
		
		//3. GregorianCalendar
		/*
		 그레고리안 달력은 1년 1월 1일이 무조건 월요일로 정의되어 있음.
		 2024, 4, 23 하면 2024년 5월 23일로 변경됨.
		 2024년 5월 23일은 목요일
		 '일 월 화 수 목 금 토 일' 중 5번째 목요일, 즉 날짜가 5로 나옴
		 */
		GregorianCalendar 그레고리안 = new GregorianCalendar();
		GregorianCalendar 그레고리안2 = new GregorianCalendar(2024, 4, 23);
		int 날짜 = 그레고리안2.get(Calendar.DAY_OF_WEEK);
	//	System.out.println("날짜 : " + 날짜);
		//일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)
		
		//4. SimpleDateFormat : 년 월 일
		/*
		 년 표기 : y
		 월 표기 : M (분 표기랑 첫 글자가 m으로 같기 때문에 월은 대문자 M)
		 일 표기 : d
		 시간 표기 : H,h (대문자 H : 0~23시, 소문자 h : 오전(am)과 오후(pm)로 나눠서 표기)
		 분 표기 : m
		 초 표기 : s
		 요일 표기 : E 0요일 쓰고 싶다면 EEEE
		 */
		SimpleDateFormat 날짜형식 = new SimpleDateFormat("yyyy-MM-dd / HH-mm-ss");
		String 날짜표시 = 날짜형식.format(new Date());
		System.out.println("날짜 형식 지정해서 표시하기 : " + 날짜표시);
		
		//5.LocalDate 현재 날짜 가져오기
		LocalDate 현재날짜 =  LocalDate.now();
	//	System.out.println("현재 날짜 : " + 현재날짜);
	}
}
