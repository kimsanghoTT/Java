package com.kh.example.practice2.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Product() {}
	
	public void information() {
		
		System.out.println("제품 이름 : " + pName);
		System.out.println("제품 가격 : " + price);
		System.out.println("제품 브랜드 : " + brand);
	}
}
