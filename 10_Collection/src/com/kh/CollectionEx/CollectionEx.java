package com.kh.CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
	Collection 
	- interface. 파일들을 연결시켜줌
	- List, Set의 부모클래스
	- 순차적으로 회전하면서 코드를 조회하거나 코드안에 작성한 내용을 순회하고
	  추가, 삭제, 검색 등 기본 작업을 제공
	
	sort : 리스트를 기본 정렬 순서에 따라 정렬
		1. 숫자 : 오름차순 정렬. 작은 값에서 큰 값 순서로 정렬
		2. 문자열 : 문자의 사전 순서에 따라 정렬
		3. 파일을 만들면서 정한 기준 : compareTo() 메소드를 활용해서 정렬 기준을 작성
		* min, max : 최소값, 최대값
		* binarySearch : 이진탐색을 사용해서 리스트에서 지정된 요소 찾기
			* 이진탐색 : 정렬된 배열이나 리스트에서 특정한 값의 위치를 찾는 알고리즘
					  배열 또는 리스트를 반으로 나눠 탐색 범위를 좁혀가면서 값을 찾아내는 것
	
	addAll : 내가 추가하고자 하는 모든 값을 추가
	

*/


public class CollectionEx {

	public static void main(String[] args) {
		//정렬
		ArrayList<Integer> 숫자 = new ArrayList<>();
		숫자.add(3);
		숫자.add(5);
		숫자.add(4);
		숫자.add(1);
		System.out.println(숫자);
		
		Collections.sort(숫자);
		System.out.println(숫자);
		
		//ArrayList에서 하나씩이 아니라 한번에 대거 추가하기
		ArrayList<String> 색상들 = new ArrayList<>(Arrays.asList("black", "white"));
												//()안에 Arrays.asList()쓰면
												//넣고싶은 만큼 추가 가능
		System.out.println(색상들);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
