package com.kh.oop.method.oop;

public class DrinkMaker {
	
	private String drinkType;	//종류
	private int quantity;		//양
	private int temp;			//온도
	public String getDrinkType() {
		return drinkType;
	}
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public DrinkMaker() {}
	
	public DrinkMaker(String drinkType, int quantity, int temp) {
		this.drinkType = drinkType;
		this.quantity = quantity;
		this.temp = temp;
	}
	
	public void makeDrink() {
		System.out.println("음료 종류 : " + drinkType);
		System.out.println("양 : " + quantity);
		if(temp < 5) {
			System.out.println("차갑게");
		}
		else if(temp >= 5 && temp <10) {
			System.out.println("미지근하게");
		}
		else {
			System.out.println("뜨겁게");
		}
		System.out.println("음료 제조 완료");
	}
}
