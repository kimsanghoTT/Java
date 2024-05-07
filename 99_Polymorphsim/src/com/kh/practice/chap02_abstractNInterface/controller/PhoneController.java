package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {


	private String result[] = new String[2];
	GalaxyNote9 gn = new GalaxyNote9();
	V40 v40 = new V40();
	
	public String[] method() {
		Phone[] phones = new Phone[2];
		phones[0] = gn;
		phones[1] = v40;
		
		for(int i = 0; i<2; i++) {
			if(phones[i] instanceof GalaxyNote9) {
				result[i] = gn.printInformaion();
			}
			else if(phones[i] instanceof V40) {
				result[i] = v40.printInformaion();
			}
		}
		return result;
		
	}
}
