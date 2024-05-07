package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {

	public static void main(String[] args) {
		
		TreeMap<String, String> fruit = new TreeMap<>();
		
		String[] keys = {"apple", "banana", "orange", "watermelon", "grape"};
		String[] values = {"사과", "바나나", "오렌지", "수박", "포도"};
		
		for(int i = 0; i< keys.length; i++) {
			fruit.put(keys[i], values[i]);
		}
		
		//전체 출력
		System.out.println(fruit);
		//get으로 바나나에 해당하는 값 가져오기
		System.out.println("banana는 " + fruit.get("banana"));
		//size 확인
		System.out.println("fruit 크기는 " +fruit.size());
		//isEmpty 확인
		System.out.println("fruit 비었냐? " + fruit.isEmpty());
		//containsKey - grape
		System.out.println("grape있냐? " + fruit.containsKey("grape"));
		//containsValue - 포도
		System.out.println("포도 있냐? " + fruit.containsValue("포도"));
		//KeySet() 모든 키 출력
		System.out.println("모든 키 출력 " +fruit.keySet());
		//ValueSet() 모든 값 출력
		System.out.println("모든 값 출력 " +fruit.values());
		//firstKey() 첫 번째 키 출력
		System.out.println("첫 번째 키 출력 " + fruit.firstKey());
		//lastKey 마지막 키 출력
		System.out.println("마지막 값 출력 " +fruit.lastKey());
		//entrySet 키-값 짝지어서 출력
		System.out.println("키-값 짝지어서 출력 " +fruit.entrySet());
		fruit.clear();
		System.out.println(fruit);
	}
}
