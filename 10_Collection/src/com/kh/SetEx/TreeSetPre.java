package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {

	public static void main(String[] args) {
		//String 과일들 "키위 복숭아 참외 수박 딸기"
		TreeSet<String> 과일들 = new TreeSet<>(Set.of("키위", "복숭아", "참외", "수박", "딸기"));
		
		//Set.of("", "","","","") : Set 배열에 한번에 넣기
		
	/*	과일들.add("키위");
		과일들.add("복숭아");
		과일들.add("참외");
		과일들.add("수박");
		과일들.add("딸기");*/
		System.out.println(과일들);
		//복숭아 제거
		과일들.remove("복숭아");
		//수박이 포함됐는지 확인
		System.out.println(과일들.contains("수박"));
		//과일들이 비어있는지 확인
		System.out.println(과일들.isEmpty());
		//과일들 개수
		System.out.println(과일들.size());
		//가장 작은 값
		System.out.println(과일들.first());
		//가장 큰 값
		System.out.println(과일들.last());
		//모든 값 제거
		과일들.clear();
		System.out.println(과일들);
		
		
	}

}
