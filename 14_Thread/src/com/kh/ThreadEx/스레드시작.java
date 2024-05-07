package com.kh.ThreadEx;

public class 스레드시작 {

	public static void main(String[] args) {
		
		for(int i = 0; i <10; i++) {
			
			Thread 스레드 = new 스레드연습(i);
			
			스레드.start();
			
		}
	}
}
