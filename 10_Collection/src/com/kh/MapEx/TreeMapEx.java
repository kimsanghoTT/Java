package com.kh.MapEx;

import java.util.TreeMap;

/*	
	TreeMap
	- 키-값(key-value) 저장하는 자료 구조
	- 키를 기준으로 정렬해서 저장(0 ~ 9, ㄱ ~ ㅎ, A ~ Z)
	- 이진검색트리. 데이터 검색, 삽입, 삭제, 연산을 빠르게 가능
	
	메서드
	put(key, value) : TreeMap에 key와 값(value)을 집어넣음
	get(key) : 저장된 key에 있는 value값을 전달
	containsKey(key) : key가 호환(존재하는지)되어 있는지 확인
	containsValue(value) : value가 호환(존재하는지)되어 있는지 확인
	remove(key) : 지정된 key 와 그 value 삭제
	size() : (저장되어있는)key - value 쌍의 개수 반환
	isEmpty() : TreeMap이 비어있는지 확인
	clear() : 모두 제거

*/
public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		//put 사용해서 값 추가
		tm.put(1, "One");
		tm.put(2, "Two");
		tm.put(3, "Three");
		
		//한 번에 작성하기
		Integer[] keys = {1, 2, 3};
		String[] values = {"One", "Two", "Three"};
		
		//반복문을 통해 추가
		for(int i = 0; i < keys.length; i++) {
			tm.put(keys[i], values[i]);
		}
		
		//Map또한 키 중복 X. 밸류가 다를경우 맨 밑에 작성한 밸류로 덮어씌워짐
		
		System.out.println(tm);
		
		//get 메서드를 사용해서 값 가져오기
		System.out.println(tm.get(2));
		
		//remove로 키-값 제거
		tm.remove(3);
		System.out.println(tm);
		
		//containsKey로 키가 있는지 확인
		System.out.println(tm.containsKey(1));
		
		//size로 개수 확인
		System.out.println(tm.size());
		
		//isEmpty로 비어있는지 확인
		System.out.println(tm.isEmpty());
		
		//clear로 모든 값 제거
		tm.clear();
		System.out.println(tm);
	}
}
