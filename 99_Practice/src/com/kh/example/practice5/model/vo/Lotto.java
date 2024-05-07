package com.kh.example.practice5.model.vo;

import java.util.Random;

public class Lotto {

	
	private int[] lotto;

	public Lotto() {}
	
	public void information() {
		
		Random ran = new Random();
		for(int i = 1; i <= 6; i++) {
			
			int ranNumber = ran.nextInt(45)+1;
			System.out.println("랜덤 숫자 " + i + " : " + ranNumber);
		}
		
	}
}
