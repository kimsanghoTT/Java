package com.kh.abstractEx;

public class 사각형 extends 도형 {

	//필드
	private double 가로;
	private double 세로;
	
	public 사각형(String 색깔, double 가로, double 세로) {
		super(색깔);
		this.가로 = 가로;
		this.세로 = 세로;
	}
	@Override
	public double 도형넓이() {
		return 가로 * 세로;
	}
	@Override
	public double 도형둘레() {
		return (가로 + 세로) * 2;
	}
	
	
}
