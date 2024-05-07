package com.kh.IteratorEx;
/*
	ListIterator
	
	hasNext() : 다음 값이 존재하는지 확인(true/false)
	next() : 다음 값 가져오기
	
	hasPrevious() : 이전 값 존재하는지 확인(true/false)
	previous : 이전 값 가져오기
	
	next는 앞에서부터, previous는 뒤에서부터
	add() : 추가
	remove() : 삭제
*/

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		ArrayList<String> 색상들 = new ArrayList<>();
		색상들.add("빨강");
		색상들.add("화이트");
		색상들.add("초록");
		
		ListIterator<String> 반복하기 = 색상들.listIterator();
		
		while(반복하기.hasNext()) {
			String 색상 = 반복하기.next();
			System.out.println(색상);
		}
		while(반복하기.hasPrevious()) {
			String 색상 = 반복하기.previous();
			System.out.println(색상);
		}
		System.out.println("add를 사용해서 추가하기");
		반복하기.add("파랑");
		System.out.println(색상들); // add로 추가할 때는 앞에 추가가 됨
		
		/*
		System.out.println(색상들); 
		Exception in thread "main" java.lang.IllegalStateException
	at java.base/java.util.ArrayList$Itr.remove(ArrayList.java:980)
	at com.kh.IteratorEx.ListIteratorEx.main(ListIteratorEx.java:40)
	
	add 값을 추가하면서 앞으로 이동한 다음에는 리스트의 끝에 위치하게 됨
	-> 더 이상 다음이 없기 떄문에 삭제할 수 없음
	
	해결하는 방법 : next()를 호출해서 위치를 변경한 다음에 remove()호출하거나
	previous()를 호출해서 현재 위치를 변경한 다음에 remove()호출
	*/
		반복하기.previous();
		반복하기.remove();
		
		System.out.println("삭제 확인 : " + 색상들);
		
	}
}
