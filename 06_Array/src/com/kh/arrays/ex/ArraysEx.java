package com.kh.arrays.ex;

import java.util.Arrays;

/*
	Arrays
	- 배열과 관련된 다양한 작업을 쉽게 처리할 수 있도록 도와줌
	- 정렬, 복사, 비교
	- 메서드
		sort() : 배열을 정렬
		copyOf() : 배열을 복사해서 똑같은 배열을 생성
		equals() : 두 배열이 같은지 비교
		fill() : 배열을 모두 지정된 값으로 채우기
		toString() : 배열을 문자열로 변경해서 보여줌
		asList() : 배열을 리스트로 변환해서 추가. 배열을 수정하지 않고 배열의 내용을 감싸서 보여줌
		
		String[] 배열 = {"사과", "바나나"};
		
		//List 계열에 추가할 떄
		 ArrayList<String> 리스트 = new ArrayList<>(Arrays.asList(배열));
		 ArrayList<String> 리스트 = new ArrayList<>(Arrays.asList("사과", "바나나"));
	*/
public class ArraysEx {
	
	public static void main(String[] args) {
		int num[] = {5, 8, 2, 4, 3};
		
		//정렬
		Arrays.sort(num);
		
		//배열이 위치한 주소 출력
		System.out.println(num);
		
		//배열을 오름차순으로 정렬한 것을 문자열로 변경해서 출력
		System.out.println(Arrays.toString(num));
		
		//배열 복사
		//배열이 들어갈 변수명 먼저 생성
		//int 배열이면 int 배열을 생성
		//복사 붙여넣기  Arrays.copyOf(복사될변수, 어디까지 복사할지 지정);
		int abc[] = Arrays.copyOf(num, num.length);
		
		System.out.println(Arrays.toString(abc));
		//두 배열이 같은지 확인. 배열 순서 상관없음
		boolean same = Arrays.equals(num, abc);
		
		System.out.println(same);
		
		// 모든 자리에 똑같은 값으로 지정해서 출력
		int[] 똑같은숫자들 = new int[5];
		
		Arrays.fill(똑같은숫자들, 3);
		
		System.out.println(Arrays.toString(똑같은숫자들));
	}
	
	
	
	
}
