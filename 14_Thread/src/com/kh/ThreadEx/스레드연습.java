package com.kh.ThreadEx;

public class 스레드연습 extends Thread{

	//필드
	int 초;
	
	//메서드 - 필수 생성자
	public 스레드연습(int 초) {
		this.초 = 초;
	}
	
	public void run() {
		System.out.println(this.초 + "스레드 시작");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(this.초 + "스레드 종료");
	}
	
	
}
