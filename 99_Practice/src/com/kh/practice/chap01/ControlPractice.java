package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice11() {
		//4자리 정수를 입력 받아 중복값이 없을 경우 성공
		//중복 값이 있으면 중복 값 있음 출력
		//자리수가 안맞으면 자리 수 안 맞음 출력
		//맨 앞 자리 수의 값은 1~9 의 정수
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("비밀번호 입력(1000~9999) : ");
			int password = sc.nextInt();
			if(password > 9999 || password < 1000) {
				System.out.println("자리수 안맞음");
				continue;
			}
			//자리값
			int[] digits = new int[4]; //4자리만 허용
			digits[0] = password / 1000; // 천의 자리
			digits[1] = (password / 100) % 10; // 백의 자리
			digits[2] = (password / 10) % 10; // 십의 자리
			digits[3] = password % 10;
			
			boolean isTrue = true;
			
			for(int i = 0; i<digits.length; i++) {
				//length : 크기
				for(int j = i+1;j<digits.length; j++) {
					if(digits[i] == digits[j]) {
						isTrue = false;
						break;
					}
				}
				if(!isTrue) {
					break;
				}
				if(!isTrue) {
					System.out.println("중복 값이 있음");
				}
				else {
					System.out.println("비밀번호 생성 성공");
					break;
				}
			}
		}
	}
}
