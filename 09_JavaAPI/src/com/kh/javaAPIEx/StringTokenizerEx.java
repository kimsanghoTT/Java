package com.kh.javaAPIEx;

import java.util.StringTokenizer;

/*
	StringTokenizer
	Token : 최소 단위의 정보를 가진 물리적, 또는 가상적 물체
*/


public class StringTokenizerEx {

	public static void main(String[] args) {
		//소괄호 안에 ""로 무언가를 넣어줘야함
		StringTokenizer token = new StringTokenizer("자바는 어려워");
		//hasMoreToken : 만약에 토큰 글자 안에 글자가 들어있다면 True
		while(token.hasMoreTokens()) {
			//nextToken : 다음 토큰 보여줌
			System.out.println(token.nextToken());
			//기본으로 띄어쓰기를 기준으로 구분
		}
		
		//구분자를 ','로 넣은 tokenizer 보기
		StringTokenizer token2 = new StringTokenizer("오렌지,사과,포도",   ","  );
		//오렌지사과포도를 ',' 기준으로 나눔
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
	}
}
