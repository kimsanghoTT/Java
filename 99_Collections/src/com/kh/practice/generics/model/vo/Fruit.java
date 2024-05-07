package com.kh.practice.generics.model.vo;

public class Fruit extends Farm{

	private String name;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
