package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator;

/*
	Collections(List, Set, Map) : 반복하는데 사용
	Enumeration : 더 이상 권장 x. Vector와 같은 오래된 버전 클래스에서만 사용됨
	
	Iterator - 반복하는데 사용(순차적으로 회진)
			 - 읽기만 가능. 추가하거나 삭제 불가

	ListIterator - Iterator 업그레이드 버전
				 - List 컬렉션(Vector, ArrayList, LinkedList)에서만 사용 가능
				 - 양방향으로 순차적으로 회진할 수 있음
				 - 양방향으로 순회 = 앞 뒤 방향 이동 가능
				 - 추가하거나 삭제 가능

	Iterator 밑에 있는 메서드
	- hasNext() : 다음이 있는지 없는지 확인. 존재하면 true, 없으면 false
	- next() : 다음 것을 가지고 오는데 사용
			   next()는 사용하기 전에 hasNext()를 사용해서 다음이 있는지 확인한 후에
			   사용하는 것이 안전(exception 에러가 날 수 있기 때문)
	*/
public class IteratorEx {
	
	public static void main(String[] args) {
		ArrayList<String> 과일들 = new ArrayList<>();
		과일들.add("사과");
		과일들.add("블루베리");
		과일들.add("패션후르츠");
		과일들.add("망고");
		
		//Iterator 생성
		Iterator<String> 반복 = 과일들.iterator();
		
		//hasNext() 다음 값이 있는지 확인
		
		while(반복.hasNext()) {
			String 과일 = 반복.next();
			System.out.println(과일);
		}
		
	}
}
