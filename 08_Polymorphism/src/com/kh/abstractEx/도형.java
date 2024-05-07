package com.kh.abstractEx;
/*
	추상 클래스(abstract class)
	- 추상 메서드를 포함하고 있는 클래스
	- 미완성 클래스이기 때문에 컴퓨터에 추상 클래스로 만든 파일의 자체 공간을 만드는 건 불가능
	
	사용 예제
	* [접근 제어자] : public, private, protected, default
	[접근 제어자] abstract class 파일명 {
		
		필드 & 메서드(필수 x)
		[접근 제어자] abstract 자료형 변수명();
		
	}
*/

public abstract class 도형 { //추상 클래스
	
	//추상 : 같은 것을 본뜬 것
	
	//필드
	private String 색깔;
	//메서드
	public String get색깔() {
		return 색깔;
	}
	public void set색깔(String 색깔) {
		this.색깔 = 색깔;
	}
	
	public 도형() {
	}
	
	public 도형(String 색깔) {
		this.색깔 = 색깔;
	}
	
	/*abstract : 나중에 설계도를 완성할 파일에서 필수로 불러줘서 완성해야하는 메서드들
	 
	 abstract 메서드는 미완성 메서드이기 때문에 자식클래스에서 미완성된 부모클래스를 완성시켜주기위해
	 자식이 부모를 불러올 때, abstract 메서드는 자식클래스에서 필수로 불러온 다음 
	 메서드 모양을 완성해야함
	 */
	public abstract double 도형넓이();
	public abstract double 도형둘레();
	
	public void 출력정보(){
		System.out.println("이 도형의 넓이는 " + 도형넓이() + ", 도형의 둘레는 " + 도형둘레() + "입니다.");
		
	}
	
}
