package com.kh.interfaceEx;

public class 세탁기 implements 기계{

	@Override
	public void 전원켜기() {
		System.out.println("세탁기의 전원을 킨다");
	}
	@Override
	public void 전원끄기() {
		System.out.println("세탁기 전원을 끈다");
	}
}
