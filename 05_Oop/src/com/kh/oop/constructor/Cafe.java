package com.kh.oop.constructor;

public class Cafe {
	//필드 - 카페이름, 지역, 테이블 수
	
	public String name;
	public String location;
	public int tableNum;
	
	//기본 생성자
	public Cafe(){}
	
	//필수 생성자
	public Cafe(String name, String location, int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
	}
	
	public void cafeInfo() {
		System.out.println("카페 이름 : " + name);
		System.out.println("카페 위치 : " + location);
		System.out.println("테이플 수 : " + tableNum);
		System.out.println("===================");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("안녕하세요 kh민족입니다");
		System.out.println("====== 카페 조회하기 ======");
		
		Cafe cafe1 = new Cafe();{
			cafe1.name = "백다방";
			cafe1.tableNum = 15;
			cafe1.cafeInfo();
		}
		
		Cafe cafe2 = new Cafe();{
			cafe2.location = "인천";
			cafe2.tableNum = 10;
			cafe2.cafeInfo();
		}
		
		Cafe cafe3 = new Cafe("MEGA COFFEE", "인천", 4);
		
		cafe3.cafeInfo();
	
		
	}

}
