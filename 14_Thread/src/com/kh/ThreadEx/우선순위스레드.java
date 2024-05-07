package com.kh.ThreadEx;

public class 우선순위스레드 {


	public static void main(String[] args) {
		
		//for문으로 1~3까지 반복
		//1~10까지 차례대로 실행할 수 있도록 설정
		
		for(int i = 0; i<=3; i++) {
			
			스레드연습 스레드 = new 스레드연습(i);
			
			if(i == 0) {
				스레드.setPriority(스레드.MAX_PRIORITY);
			}
			else if(i == 1) {
				스레드.setPriority(스레드.NORM_PRIORITY);
			}
			else {
				스레드.setPriority(스레드.MIN_PRIORITY);
			}
			스레드.start();
			
		}
		
		
		
	}
}
