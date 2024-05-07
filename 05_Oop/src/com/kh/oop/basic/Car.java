package com.kh.oop.basic;

public class Car {
	//필드
	public String color;
	public int speed;
	public String door;
	public String window;
	public String sunRoof;
	public String insurance;
	//생성자 = 필수 옵션
	//생성자는 클래스명과 같아야 한다
	//생성자 이름 = 클래스 이름 =파일명
	// 생성자 = 메서드를 담거나 초기화를 위한 생성자
	public Car() {}
	public Car(String inputColor, int inputSpeed) {
		this.color = inputColor;
		this.speed = inputSpeed;
	}
	
	//메서드
	public void displayInfo() {
		System.out.println("  차 정보  ");
		System.out.println("Color : " + color);
		System.out.println("Spped + " + speed);
		

	}
	public static void main(String[] args) {
		//
		Car myCar = new Car();
		myCar.color = "빨간색";
		System.out.println("나의 차 색상 : " + myCar.color);
		
		Car orderCar = new Car("black", 60);
		
		orderCar.displayInfo();
		
		//storeCar 주문 색상 white 스피드 최대 100
		//색상과 스피드 출력
		
		Car storeCar = new Car("white", 100);
		
		storeCar.displayInfo();
	}

}
