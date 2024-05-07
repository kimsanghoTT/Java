package com.kh.javaAPIEx;

public class ObjectEx {
/*
	Object
	- 모든 자바 클래스의 최상위 클래스
	- 모든 클래스가 기본으로 상속받는 클래스
	- Object클래스는 기본으로 사용된다는 개념이 있기 떄문에 굳이 new Object를 쓰지않음
	
	- 대표적인 메서드 : equals, toString
	
*/	
	public boolean equals(Object obj) {
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "Object에서 부터 내려오는 메서드";
	}
	
	public static void main(String[] args) {
		//objet는 기본이기 때문에 굳이 new를 써서 공간생성 x
		//그렇다고 만들 수 없는 건 아님
		
		//Object 위에 마우스 올리고 노란색 화면 위에 마우스를 올려서 @ 옆 아이콘을 누르면
		//Object 파일로 이동해서 볼 수 있음
		Object 오브젝트 = new Object();
		
		오브젝트.toString();
		System.out.println(오브젝트);
	}



}
