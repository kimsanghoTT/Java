package com.kh.oop.method.oop;

public class CoffeeStore {

	//커피 만드는 파일을 가져와서 각 가게의 커피만드는 방법을 다르게 작성
	private CoffeeMaker maker;
	private String storeName;
	private String location;
	public CoffeeMaker getMaker() {
		return maker;
	}
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public CoffeeStore() {}
	
	//필수 : 커피제조방법, 가게명, 지역
	public CoffeeStore(CoffeeMaker maker, String storeName, String location) {
		this.maker = maker;
		this.storeName = storeName;
		this.location = location;
	}
	
	public void orderCoffee() {
		
		System.out.println("매장 위치 : " + location);
		System.out.println("커피 매장 : " + storeName);
		maker.makingcoffee();
	}
	
}
