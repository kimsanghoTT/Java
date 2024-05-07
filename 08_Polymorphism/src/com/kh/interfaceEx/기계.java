package com.kh.interfaceEx;
/*
	interface
	- 클래스 간의 접점을 만드는 용도
	- 필드에 작성하는 모든 변수를 public static final 로 작성해야함
	- 굳이 앞에 public static final 을 붙이지 않아도 알아서 붙음
	- 모든 메서드 앞에 public abstract가 자동으로 붙음
	
	인터페이스에서 public static final과 public abstract가 자동으로 붙는 이유
	- 인터페이스는 자바에서 다른 클래스에서 구현할 메서드의 명세를 정의하는 역할을 함
	- 인터페이스에 작성되는 필드와 메서드는 다른 클래스에서 구현될 것을 기대함
	
	- 추상 클래스와 달리 변경이 불가능. 주는 필드 값이 강제
	
*/

public interface 기계 {
	
	//필드
	//(public static final)이 자동으로 생겨져 있음
	int 볼트 = 220;
	// public static final int 볼트 = 220;과 같음
	
	//인터페이스는 추상 메서드만 작성이 가능
	public abstract void 전원켜기();
	//(public abstract)가 자동 생성됨
	void 전원끄기();
	//public abstract void 전원끄기();와 동일
}
