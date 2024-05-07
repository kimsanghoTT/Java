package practice3.controller;

import practice3.model.vo.Animal;

public class Horse extends Animal {

	private String location;
	private String color;
	
	public Horse() {
		// TODO Auto-generated constructor stub
	}

	public Horse(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString() + " 제가 사는 지역은 " + location
				 + "이며, 털 색깔은 " + color + "입니다.");
	}
}
