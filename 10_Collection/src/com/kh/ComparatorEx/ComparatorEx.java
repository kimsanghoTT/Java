package com.kh.ComparatorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
	Comparator : 비교하는 객체
	
	메서드
	- compare(변수명1, 변수명2) : 두 객체나 변수를 비교해서 정렬 순서를 결정
	변수명1 < 변수명2 : 음수 반환
	변수명1 = 변수명2 : 0 반환
	변수명1 > 변수명2 : 양수 반환

	- reversed() : 순서를 거꾸로 뒤집어서 순서를 매길때 사용
	
	-comparing(클래스명::참조할메서드명) 클래스 밑에서 참조할 메서드를 가지고 와서 정렬 기준 결정
	*/

public class ComparatorEx {

	public static void main(String[] args) {
		
		List<String> 단어들 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		
		//단어의 길이를 기준으로 정렬
		
		Comparator<String> 길이비교 = Comparator.comparing(String::length);
		//클래스명 :: 참조할 메서드명
		//String 클래스의 밑에 있는 length 메서드를 사용해서 비교
		
		//sort사용해서 정렬
		단어들.sort(길이비교);
		System.out.println(단어들);
		
		
		
		
	}
}
