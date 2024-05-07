package com.kh.oop.method.ex;

public class PizzaStore {

	private String pizzaName; //피자 이름
	private int pizzaPrice; //피자 가격

	//메서드
	//getter setter
	public String getPizzaName() {
		return pizzaName;
	}
	
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	
	//기본 생성자
	public PizzaStore() {}
	
	//필수 생성자
	public PizzaStore(String pizzaName, int pizzaPrice) {
		this.pizzaName = pizzaName;
		this.pizzaPrice = pizzaPrice;
	}
	//void
	public void pizzaInfo() {
		
		System.out.println("피자 이름 : " + pizzaName);
		System.out.println("피자 가격 : " + pizzaPrice);
	}
	public static void main(String[] args) {
		
		PizzaStore bulgogi = new PizzaStore();
		
		bulgogi.setPizzaName("불고기피자");
		bulgogi.setPizzaPrice(18000);
		
		bulgogi.pizzaInfo();
		
		System.out.println("====================");
		
		PizzaStore potato = new PizzaStore();
		
		potato.setPizzaName("포테이토 피자");
		//가격 적는 것을 잊음
		potato.pizzaInfo();
		
		//필수 생성자로 피자 생성
		System.out.println("====================");
		
		PizzaStore cheeze = new PizzaStore("치즈 피자", 17000);
		
		cheeze.pizzaInfo();
		
	}
	
}
