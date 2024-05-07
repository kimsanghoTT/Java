package com.kh.oop.basic;

public class 리모컨 {
	
	//1. 필드 생성
	public boolean powerOn;
	public int volume;
		
	
	//2. 생성자
	public 리모컨() {}//최초 생성자
	public 리모컨(int vol) {
		//필수 생성자
		this.volume = vol;
		
	}
	
	//3. 메서드
	public void 상태() {
		System.out.println("음량 : " + volume);
	}
	//최종 출력할 메인 메서드를 만들어서
	//리모컨 음량을 200으로 만들어서 음량이 200이 맞는지 확인하기

	//1. 초기 공간 생성자 만들기, 2. 메인메서드에서 음량 출력하기
	
	public static void main(String[] args) {
		
		리모컨 rmc = new 리모컨();
		
		rmc.powerOn = true;
		rmc.volume = 200;
		System.out.println("리모컨의 전원은 " + rmc.powerOn + "이고,"
				+ "볼륨은 " + rmc.volume + "입니다.");
		
		리모컨 orderRmc = new 리모컨(200);
		//리모컨 음량이 필수이기때문에 200을 넣어줌
		
		orderRmc.상태();
		
	}
	
	
}
