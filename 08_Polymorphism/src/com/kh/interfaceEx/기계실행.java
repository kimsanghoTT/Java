package com.kh.interfaceEx;

public class 기계실행 {
	
	public static void main(String[] args) {
		컴퓨터 윈도우 = new 컴퓨터();
		
		윈도우.전원켜기();
		윈도우.전원끄기();
		
		System.out.println("====================");
		
		세탁기 드럼 = new 세탁기();
		
		드럼.전원켜기();
		드럼.전원켜기();
		
		System.out.println("====================");
		
		어린이용계산기 계산기 = new 어린이용계산기();
		
		계산기.전원켜기();
	
		int a = 10;
		int b = 5;
		
		System.out.println(a + " + " + b + " = " + 계산기.합(a, b));
		System.out.println(a + " - " + b + " = " + 계산기.차(a, b));
		System.out.println(a + " * " + b + " = " + 계산기.곱(a, b));
		System.out.println(a + " / " + b + " = " + 계산기.몫(a, b));
		System.out.println(a + " % " + b + " = " + 계산기.나머지(a, b));
		계산기.전원끄기();
		
		System.out.println("====================");
		
		중학생계산기 계산기2 = new 중학생계산기();
		
		계산기2.전원켜기();
		
		int a2 = 12000;
		int b2 = -56;
		
		System.out.println(a + " + " + b + " = " + 계산기2.합(a2, b2));
		System.out.println(a + " - " + b + " = " + 계산기2.차(a2, b2));
		System.out.println(a + " * " + b + " = " + 계산기2.곱(a2, b2));
		System.out.println(a + " / " + b + " = " + 계산기2.몫(a2, b2));
		System.out.println(a + " % " + b + " = " + 계산기2.나머지(a2, b2));
	
	}
}
