package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {

		//subString으로 Today 추출
		String 문제1 = "Today is a beautiful day.";
		String 추출 = 문제1.substring(0,5);
		System.out.println(추출);
		
		//toUpperCase로 모두 대문자로 변환
		String 문제2 = "Programming is fun and challenging";
		String 대문자 = 문제2.toUpperCase();
		System.out.println(대문자);
		
		//toLowerCase로 모두 소문자로 변환
		String 문제3 = "Learning new things is exciting";
		String 소문자 = 문제3.toLowerCase();
		System.out.println(소문자);
		
		//split로 문자열을 " "로 구분하기
		String 문제4 = "A good medicine taste bitter";
		String[] 구분 = 문제4.split(" ");
		for(String a : 구분) {
			System.out.println(a);
		}
		
		//replace로 more을 less로
		String 문제5 = "The more, the better";
		String 변환 = 문제5.replace("more", "less");
		System.out.println(변환);
		
		//charAt으로 6번째 글자 가져오기
		String 문제6 = "Walls have ears";
		char ch = 문제6.charAt(6);
		System.out.println(ch);
		
		//subString으로 his부터 끝까지 추출
		String 문제7 = "Every dog has his day";
		String 추출2 = 문제7.substring(14);
		System.out.println(추출2);
		
		
	}

}
