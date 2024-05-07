package com.kh.practice.generics.model.vo;

public class Vegetable extends Farm{

	
	private String name;
	
	public Vegetable() {
		// TODO Auto-generated constructor stub
	}

	public Vegetable(String kind, String name) {
		super(kind);
		this.name = name;
	}
	

}
