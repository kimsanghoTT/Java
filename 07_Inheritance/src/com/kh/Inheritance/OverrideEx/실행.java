package com.kh.Inheritance.OverrideEx;

/*	동물
	└강아지
*/


public class 실행 {

	public static void main(String[] args) {

		강아지 강아지1번 = new 강아지("멍멍이");
		
		강아지1번.소리();
		
		고양이 고양이1번 = new 고양이("괭이");
		
		고양이1번.소리();
		
		//소
		소 소1번 = new 소("누렁이");
		
		소1번.소리();
		//토끼
		토끼 토끼1번 = new 토끼("뿅코");
		
		토끼1번.소리();
	}

}
