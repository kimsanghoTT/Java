package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {

	//기본생성자
	public ArrayListEx2(){}
	
	public void method1() {
		//딸기 바나나 사과
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("딸기");
		list.add("바나나");
		list.add("사과");
		
		System.out.println(list.get(0) +" " + list.get(1) + " "+ list.get(2));
		
		list.set(1, "키위");
		System.out.println(list.get(0) +" " + list.get(1) + " "+ list.get(2));
		System.out.println(list.size());
		
		list.remove(1);
		System.out.println(list.isEmpty());
		
	//	list.clear();
	//	System.out.println(list.isEmpty());
		//ArrayList for문 1
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------------");
		//ArrayList for문 2
		for(String 과일 : list) {
			System.out.println(과일);
		}
	}
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		System.out.println(animal.size());
		// 컨트롤 + 알트 + 방향키 아래 = 한줄복사해서 아래 붙여넣기
		System.out.println(animal.get(0));
		System.out.println(animal.get(1));
		System.out.println(animal.get(2));
		System.out.println(animal.get(3));
		
		animal.set(2, "토끼");
		animal.remove("강아지");
		System.out.println("----------------------");
		for(String 동물 : animal) {
			System.out.println(동물);
		}
		
		animal.clear();
		System.out.println(animal.isEmpty());
	}
	
	public void method3() {
		
		// 고구마피자 포테이토피자 페퍼로니
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== 피자 메뉴 ===");
		pizza.add("고구마");
		pizza.add("포테이토");
		pizza.add("페퍼로니");
		
		//모두 보기
		System.out.println(pizza);
		
		pizza.get(0);
		pizza.get(1);
		pizza.get(2);
		
		pizza.set(2, "파인애플");
		pizza.remove("파인애플");
		
		for(String 메뉴 : pizza) {
			System.out.println(메뉴);
		}
		pizza.clear();
		
		System.out.println(pizza.isEmpty());
	}
	
	
	public static void main(String[] args) {
		
		ArrayListEx2 al = new ArrayListEx2();
		
	//	al.method1();
	//	al.method2();
		al.method3();
	}

}
