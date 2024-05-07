package com.kh.arrayList.ex;

import java.util.ArrayList;

/*
	ArrayList
	- 리스트는 배열과 비슷하지만 크기가 제한되어있지 않음
	- 따라서 원하는 만큼 담을 수 있음
	
	- ArrayList로 사용하지 말것. => 지금은 ArrayListEx로 사용
		ex) ArrayList<자료형> 변수명 = new ArrayList<자료형>();
		int -> Integer
		String -> String
		double -> Double
		char -> Character
		
	- add : 추가
	- get : 반환
	- set : 수정
	- remove : 삭제
	- size : 개수 확인
	- isEmpty : 비어있는지 확인
	- clear : 모두 삭제
	
*/

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		//index 자리 위치 0
		System.out.println(num.isEmpty());// 비어있어서 true 뜸
		//숫자 추가하기
		num.add(10); // index 0 자리에 10이 들어감
		
		System.out.println("추가 확인 : " + num.get(0));
		
	
		System.out.println(num.isEmpty()); // 10 넣어서 false 뜸 
		
		//크기 확인 size o / length x
		System.out.println(num.size()); // 1 뜸
		
		//set 수정하기
		num.set(0, 20);//num.set(자리값(key), 수정값(value));
		System.out.println(num.get(0));
		
		//삭제하기
		num.remove(0);
		System.out.println(num.get(0));//아무것도 없어서 에러 뜸
		System.out.println(num.isEmpty());
		
		
		
		
	}
	
}
