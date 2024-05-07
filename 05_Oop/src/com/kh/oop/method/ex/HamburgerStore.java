package com.kh.oop.method.ex;

public class HamburgerStore {
	
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public HamburgerStore() {
	}
	
	public HamburgerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("햄버거 이름 : " + name);
		System.out.println("햄버거 가격 : " + price);
		
	}
	
	public static void main(String[] args) {
		
		HamburgerStore bulgogi = new HamburgerStore("불고기 버거", 2000);
	
		bulgogi.info();
		
		System.out.println("=============");
		
		HamburgerStore cheeze = new HamburgerStore("치즈 버거", 3000);
		
		cheeze.info();
		
		
	}
}
