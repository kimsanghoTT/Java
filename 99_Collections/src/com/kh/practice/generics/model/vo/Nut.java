package com.kh.practice.generics.model.vo;

public class Nut extends Farm{

	
	private String name;
	
	public Nut() {
		// TODO Auto-generated constructor stub
	}

	public Nut(String kind, String name) {
		super(kind);
		this.name = name;
	}
	

}
