package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

/*
	Map ┌ HashMap : 빠른 검색 속도(가장 많이 사용)
		├ TreeMap : 정렬된 데이터를 필요한 경우 사용
		└ LinkedHashMap : 순서를 유지하면서 저장. 순서가 중요할 경우 사용

	Map
	- 특정 키를 입력하면 해당되는 값을 얻을 수 있는 Collections 객체
	- 키 : key, 값 : vaule
	
	메서드
	- put(key, value) : 지정된 키와 지정된 값의 쌍을 추가
	- get(key) : 지정된 키에 저장된 값을 보여줌
	- containsKey(key) : 지정된 키가 존재하는지 확인
	- containsValue : 지정된 값이 존재하는지 확인
	- remove(key) : 지정된 키와 키에 저장된 값을 제거
	- keySet() : 키를 포함하는 집합을 반환
	- values() : 모든 값들을 포함하는 리스트 반환
	- entrySet() : 모든 키의 쌍을 포함하는 집합을 반환

*/
public class MapEx {

	public static void main(String[] args) {
		//Map 생성
		Map<String, Integer> 학생들 = new HashMap<>();
		
		//put을 활용해서 값 추가하기
		학생들.put("철수", 90);
	//		추가하기(key,value)
		학생들.put("영희", 85);
		학생들.put("민수", 88);
		
		//전체보기
		System.out.println(학생들);
		
		//조회하기
		System.out.println(학생들.get("철수"));
		
		//영희가 사라졌는지 확인
		학생들.remove("영희");
		System.out.println(학생들);
		
		//key의 값은 중복이 될 수 없음. key는 유일해야함
		//가장 마지막 값으로 덮어씌워짐
		학생들.put("철수", 80);
		
		//학생들 성적 출력하기
		//for-each : 학생들에 들어있는 key를 모두 가지고 와서 배열하는 keySet 활용
		for(String name :학생들.keySet()) {
			//학생들.keySet() = {철수, 민수}
			//학생들.get(name) = {80,88}
			int 성적 = 학생들.get(name);
			System.out.println(name + "의 성적은 " + 성적);
		}
		
	}
}
