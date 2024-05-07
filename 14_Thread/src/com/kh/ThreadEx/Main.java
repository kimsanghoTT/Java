package com.kh.ThreadEx;

public class Main {

	public static void main(String[] args) {
		ThreadEx 스레드 = new ThreadEx();
		스레드.start();
		
		System.out.println("1차 스레드 끝. Ex2 스레드 시작");

		//for 총 3개의 스레드를 생성해서 실행

		for(int i = 0; i<3; i++) {
			//ThreadEx2의 부모이기 때문에 Thread를 왼쪽에 작성하는 게 가능
			Thread t = new ThreadEx2(i);
			
			if(i == 2) {
				t.setPriority(Thread.MIN_PRIORITY); //MIN = 1
			}
			else if(i ==1) {
				t.setPriority(Thread.MAX_PRIORITY); // MAX = 10
			}
			else {
				t.setPriority(Thread.NORM_PRIORITY); // 5 (기본)
			}
			
			
			
			
			t.start();
		}

		System.out.println("메인 끝");
		//스레드 시작 순서와 도착 순서는 상관이 없다
		} 
	
}
