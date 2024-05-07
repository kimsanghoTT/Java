package com.kh.oop.method.ex;

public class IceCream {

	private String name;
	private int sugar;
	private boolean milk;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public IceCream() {}
	
	public IceCream(String name, int sugar, boolean milk) {
		this.name = name;
		this.sugar = sugar;
		this.milk = milk;
	}
	
	public void makingIceCream() {
		System.out.println("아이스크림 이름 : " + name);
		System.out.println("설탕의 양 : " + sugar + "g");
		if(milk) {
			System.out.println("우유 추가");
		}
		else {
			System.out.println("우유 미추가");
		}
		System.out.println("아이스크림이 완성되었습니다.");
	}
}
