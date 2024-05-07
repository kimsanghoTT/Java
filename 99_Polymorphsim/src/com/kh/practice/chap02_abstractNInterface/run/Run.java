package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;
import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;

public class Run {

	public static void main(String[] args) {

		PhoneController pc = new PhoneController();
		String[] result = pc.method();
		
		for(String info : result) {
			System.out.println(info);
			System.out.println(" ");
		}
	}

}
