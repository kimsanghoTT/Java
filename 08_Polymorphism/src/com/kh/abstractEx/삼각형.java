package com.kh.abstractEx;

//도형에서 사용한 메서드 사용
//도형 : 아직 완성되지 않은 설계도

public class 삼각형 extends 도형{
	
	//필드
	private double 밑변;
	private double 높이;


	//필수 생성자	
	public 삼각형(String 색깔, double 밑변, double 높이) {
		super(색깔);
		this.밑변 = 밑변;
		this.높이 = 높이;
	}
	@Override
	public double 도형넓이() {
		return 0.5 * 밑변 * 높이;
	}
	
	@Override
	public double 도형둘레() {
		double 빗변 = Math.sqrt(Math.pow(밑변, 2) + Math.pow(높이, 2));
		
	/*	Math
			- sqrt = 제곱근을 계산하는 메서드
				-- 어떤 수를 곱해서 얻은 결과가 원래의 수가 되도록 하는 수
			- pow = 주어진 값을 거듭제곱하는 메서드
				-- 
			*/
		
		return 밑변 + 높이 + 빗변;
	}
}
