package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements Phone, Camera, CellPhone, touchDisplay,NotePen{

	private String maker; //제조사 정보
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public abstract String printInformaion();
	
}
