package com.kh.example.practice3.model.vo;

public class Circle {

	private double PI = 3.14;
	private int radius = 1;
	
	public Circle() {}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		double area = radius * radius * PI;
		System.out.println("원의 넓이 : " + area);
	}
	
	public void getSizeOfCircle() {
		double size= radius * 2 * PI;
		System.out.println("원의 둘레 : " + size);
	}
}
