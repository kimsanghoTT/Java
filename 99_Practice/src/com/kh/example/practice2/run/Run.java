package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Product lego = new Product();
		
		lego.setpName("AirPlane");
		lego.setPrice(105000);
		lego.setBrand("LEGO");
		
		lego.information();
		
		System.out.println("==== get으로 불러오기 ====");
		
		System.out.println("이름 : " + lego.getpName());
		System.out.println("가격 : " + lego.getPrice());
		System.out.println("브랜드 : " + lego.getBrand());
	}

}
