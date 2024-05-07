package com.kh.oop.method.oop;

public class CafeRun {

	public static void main(String[] args) {
		//커피 제조
		CoffeeMaker cm = new CoffeeMaker("아메리카노", 1, false);
		//커피 주문
		CoffeeStore cs = new CoffeeStore(cm, "스타벅스", "서울");
		
		cs.orderCoffee();
		
	
	}

}
