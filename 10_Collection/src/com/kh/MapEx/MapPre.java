package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
	
	public MapPre() {
		// TODO Auto-generated constructor stub
	}
	
	public void practice1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시쉬림프");
		System.out.println(map);
	}
	
	public void practice2() {
		Map<String, String> map = new HashMap<>();
		//map.put을 활용해서 학원-서울시 강남구/ 등산-서울시 관악구/ 롯데타워-서울시송파구
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워", "서울시 송파구");
		//전체출력
		System.out.println(map);
		//롯데타워가 어디있는지 출력
		System.out.println(map.get("롯데타워"));
		//등산 삭제하기
		map.remove("등산");
		System.out.println(map);
		//for-each로 전체 목록 출력
		for(String landMark : map.keySet()) {
			String location = map.get(landMark);
			System.out.println(landMark+ "의 위치는 " +location + "입니다.");
		}
		
	}
	
	public void practice3() {
		Map<String, Integer> map= new HashMap<>();
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("체리", 300);
		
		//200원짜리 과일이 있는가
		System.out.println("200원 과일이있는가 : " + map.containsValue(200));
		
		//체리가 존재하는가
		System.out.println("체리가 있는가 : " + map.containsKey("체리"));
		//containsValue, containsKey 모두 true, false로 보임
		
		//크기 조회
		System.out.println("현재 맵의 크기 : " + map.size());
	}
	
	public void practice4() {
		Map<Integer, String> map = new HashMap<>();
		//put을 이용해서 1-에그마요, 2-로티세리바베큐, 3-스테이크앤치즈, 4-스파이시쉬림프
		
		map.put(1, "에그마요");
		map.put(2, "로티세리바베큐");
		map.put(3, "스테이크앤치즈");
		map.put(4, "스파이시쉬림프");
		
		//get으로 3번에 뭐가 들었는지 확인
		System.out.println(map.get(3));
		
		//size()로 총 메뉴 몇개인지 확인
		System.out.println(map.size());
		
		//remove로 4번 삭제
		map.remove(4);
		System.out.println(map);
		
		//isempty로 map 비었는지 확인
		System.out.println(map.isEmpty());
		
		//for-each로 모두 보기
		for(int num : map.keySet()) {
			String menu = map.get(num);
			System.out.println(num + ". " + menu);
		}
		//Map.Entry 키와 값을 동시에 가져오는 방법. 뒤에는 변수명.entrySet()
		for(Map.Entry<Integer, String> e: map.entrySet()) {
			System.out.println(e.getKey() +" - " + e.getValue());
		}
		//clear()
		map.clear();
		System.out.println(map);
	}
	
	
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		
	//	mp.practice1();
	//	mp.practice2();
	//	mp.practice3();
		mp.practice4();
	}


}
