package com.kh.oop.method.ex;

public class Circle {
	
	private double pi = 3.14;
	private int radius = 1;
	
	public double getPi() {
		return pi;
	}
	
	public void setPi(double pi) {
		this.pi = pi;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle() {}
	
	public void incrementRadius() {
		//반지름을 1씩 증가하기
		radius++;
	}
	
	public void getAreaOfCircle() {
		double area = pi * radius * radius;
		System.out.println("원의 넓이 : " + area);
	}
	
	public void getSizeOfCircle() {
		double size = pi * radius *2;
		System.out.println("원의 둘레 : " + size);
	}
	
	public static void main(String[] args) {
		
		Circle 원 = new Circle();
		
		//1씩 증가하기 전의 원의 둘레, 넓이
		원.getAreaOfCircle();
		원.getSizeOfCircle();
		
		//원의 반지름이 1씩 증가한다면
		원.incrementRadius();
		원.getAreaOfCircle();
		원.getSizeOfCircle();
	}
}
