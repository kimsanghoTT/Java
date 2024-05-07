package com.kh.abstractEx;

public class 모형만들기 {
	
	public static void main(String[] args) {
		
		//삼각형 만들기
		삼각형 tri = new 삼각형("빨간색", 3, 4);
		
		//삼각형의 넓이, 둘레, 색상
		System.out.println("삼각형의 색깔 : " + tri.get색깔());
		System.out.println("삼각형의 넓이 : " + tri.도형넓이());
		System.out.println("삼각형의 둘레 : " + tri.도형둘레());
		
		System.out.println("--------------------------------");
		
		//사각형 만들기
		사각형 sqa = new 사각형("파란색", 4, 5);
		
		System.out.println("사각형의 색깔 : " + sqa.get색깔());
		System.out.println("사각형의 넓이 : " + sqa.도형넓이());
		System.out.println("사각형의 둘레 : " + sqa.도형둘레());
		
	}
}
