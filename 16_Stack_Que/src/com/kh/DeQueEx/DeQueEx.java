package com.kh.DeQueEx;

import java.util.ArrayDeque;
import java.util.Deque;

/*
	Deque(덱)
	- 양쪽 끝에서 삽입과 삭제가 모두 가능
	- 스택과 큐의 기능을 모두 제공
	- 양방향으로 데이터를 추가하거나 제거할 수 있음
	
	메서드
	- addFirst() : 맨 앞에 값 추가
	- addLast() : 맨 뒤에 값 추가
	- removeFirst() : 맨 앞의 값 제거
	- removeLast() : 맨 뒤의 값 제거
	- getFirst() : 맨 앞의 값 확인(제거하지 않음)
	- getLast() : 맨 뒤의 값 확인(제거하지 않음)
	
	Deque는 인터페이스이기 떄문에 ArrayDeque로 된 객체를 이용해서 공간 생성
*/
public class DeQueEx {

	public static void main(String[] args) {
		//Deque 생성
		Deque<Integer> deque = new ArrayDeque<>();
		
		//맨 앞에 값 추가 / 
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		deque.addFirst(4);
		System.out.println("addFirst 활용해서 값 추가" + deque);
		//4 3 2 1 순으로 나옴 -> 계속 맨 앞에 넣었기 떄문
		
		//맨 뒤에 값 추가 /add = addLast
		deque.addLast(5);
		deque.addLast(6);
		deque.addLast(7);
		System.out.println("addLast 활용해서 값 추가" + deque);	
		
		//맨 앞의 값 제거
		deque.removeFirst();
		System.out.println("removeFirst 활용해서 값 제거" + deque);	
		
		//맨 뒤의 값 제거
		deque.removeLast();
		System.out.println("removeLast 활용해서 값 제거" + deque);	
		
		//맨 앞, 뒤의 값 확인
		int front = deque.getFirst();
		int last = deque.getLast();
		System.out.println("맨 앞 값 : " + front + ", 맨 뒷 값 : " + last);
	}
}
