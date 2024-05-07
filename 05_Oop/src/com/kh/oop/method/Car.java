package com.kh.oop.method;

public class Car {

	//필드
	public String brand;
	public String model;
	public int year;
	
	//기본 생성자
	public Car() {}
	
	//필수 생성자
	public Car(String brand, String model, int year) {
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	
	//컨트롤 + 변수명 클릭 : 처음 변수가 만들어진 위치로 이동
	//return 메서드
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Toyota", "Camry", 2022);
		
		System.out.println(car1.getBrand() + "   " + car1.getModel() + "   " + car1.getYear());
		
		
	}

}
