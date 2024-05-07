package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		
		IceCream ice1 = new IceCream();
		
		ice1.setName("초코렛 칩");
		ice1.setSugar(60);
		ice1.setMilk(true);
		ice1.makingIceCream();
		
		IceCream ice2 = new IceCream("엄마는 외계인", 80, true);
		
		ice2.makingIceCream();
		
	}

}
