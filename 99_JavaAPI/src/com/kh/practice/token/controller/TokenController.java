package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		//StringTokenizer 써서 띄어쓰기를 없앤 문자열 반환
		String letter = "";
		StringTokenizer token = new StringTokenizer(str, " ");
		while(token.hasMoreTokens()) {
			letter += token.nextToken();
		}
		return letter;
	}

	//입력된 문자열의 첫 글자를 대문자로 변환 후 반환
	//subString(처음 시작하는 인덱스 값, 끝나는 인덱스 값)
	//subString(처음시작하는 인덱스 값) : 내가 원하는 숫자부터 끝까지 보기
	//toUpperCase
	public String firstCap(String input) {
		return input.substring(0,1).toUpperCase() + input.substring(0);
	}
	
	public int findChar(String input, char one) {
		//매개변수의 문자가 문자열 안에 몇개 들어있는지 반환
		int count = 0;
		char[] arr = input.toCharArray();
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}
		return count;
	}
	
}
