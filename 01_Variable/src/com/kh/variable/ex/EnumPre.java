package com.kh.variable.ex;

public class EnumPre {

	
	public enum 무지개{
		빨강, 주황, 노랑, 초록, 파랑, 남색, 보라	
	}
	
	public enum 소비자{
		학생, 소비자, 직장인, 노인
	}
	
	public enum 판매자{
		소매업, 도매업, 중매업
	}
	public EnumPre() {
		// TODO Auto-generated constructor stub
	}
	
	public void method1() {
		//배열에 담기
		무지개[] 배열 = 무지개.values();
		for(무지개 r : 배열) {
			System.out.println(r);
		}
	}
	
	public void method2() {
		//for-each로 소비자와 판매자 각각 출력
		소비자[] 소비자배열 = 소비자.values();
		판매자[] 판매자배열 = 판매자.values();
		System.out.println("=== 소비자 목록 ===");
		for(소비자 c : 소비자배열) {
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("=== 판매자 목록 ===");
		for(판매자 s : 판매자배열) {
			System.out.println(s);
		}
		System.out.println();
		
		//소비자 학생, 판매자 소매업 ordinal() if문 사용해서 비교하는 문장 작성
		소비자 c = 소비자.학생;
		System.out.println("학생의 등급 : " + c.ordinal());
		판매자 s = 판매자.소매업;
		System.out.println("소매업의 등급 : " + s.ordinal());
		
		if(c.ordinal() > s.ordinal()) {
			System.out.println("소비자의 등급이 더 높음");
		}
		else if(c.ordinal() == s.ordinal()){
			System.out.println("소비자와 판매자의 등급이 같음");
		}
		else {
			System.out.println("판매자의 등급이 더 높음");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		EnumPre ep = new EnumPre();
		
		ep.method2();
	}

	

	
}
