package com.kh.oop.method.oop;

public class DrinkStore {
	
	private DrinkMaker maker;
	private String location;
	private String name;
	private boolean takeout; 
	
	public DrinkMaker getMaker() {
		return maker;
	}

	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTakeout() {
		return takeout;
	}

	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}

	public DrinkStore() {}
	
	public DrinkStore(DrinkMaker maker, String location, String name, boolean takeout) {
		this.maker = maker;
		this.location = location;
		this.name = name;
		this.takeout = takeout;
	}
	
	public void orderDrink() {
		System.out.println("매장 위치 : " + location);
		System.out.println("매장 이름 : " + name);
		if(takeout) {
			System.out.println("테이크 아웃 요청이 접수되었습니다.");
		}
		else {
			System.out.println("매장 내에서 섭취합니다.");
		}
		System.out.println("음료 주문 상세 설정");
		maker.makeDrink();
	}
}
