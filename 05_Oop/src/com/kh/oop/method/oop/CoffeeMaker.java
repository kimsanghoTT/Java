package com.kh.oop.method.oop;

public class CoffeeMaker {

	private String coffeeType;
	private int sugar;
	private boolean milk;
	public String getCoffeeType() {
		return coffeeType;
	}
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	//getter - boolean의 경우 get이 아니라 is로 표기됨
	public boolean isMilk() {
		return milk;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	public CoffeeMaker() {}
	
	public CoffeeMaker(String coffeeType, int sugar, boolean milk) {
		this.coffeeType = coffeeType;
		this.sugar = sugar;
		this.milk = milk;
	}
	
	public void makingcoffee() {
		System.out.println("커피를 제조합니다.");
		System.out.println("커피 종류 : " + coffeeType);
		System.out.println("설탕의 양(스푼) : " + sugar + "스푼");
		if(milk) {
			System.out.println("우유 추가");
		}
		else {//우유 없음
			System.out.println("우유 미추가");
		}
		System.out.println("커피가 준비되었습니다.");
	}
	/*
	public static void main(String[] args) {
		
		//기본 생성자
		Coffeemaker coffee1 = new Coffeemaker();
		
		coffee1.setCoffeeType("아메리카노");
		coffee1.setSugar(2);
		coffee1.setMilk(false);
		coffee1.makingcoffee();
		
		//필수 생성자
		Coffeemaker coffee2 = new Coffeemaker("밀크 커피", 2, true);
		
		coffee2.makingcoffee();
	}*/
}


