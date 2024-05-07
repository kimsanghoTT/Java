package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {

	private Snack s = new Snack();
	
	public SnackController() {
	}
	//return 메서드 saveData
	public String saveData(String kind, String name, String flavor
			, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료";
		
	}
	//return 메서드 confirmData
	public String confirmData() {
		return s.information();
	
	}
	
}
