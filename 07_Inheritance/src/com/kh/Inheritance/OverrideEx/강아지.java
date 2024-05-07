package com.kh.Inheritance.OverrideEx;

//강아지가 동물에서 소리를 상속
public class 강아지 extends 동물{

/*	super(이름)
	- 동물 클래스 동물의 생성자를 호출하는 역할
	- super() : 자바에서 자식 클래스의 생성자는 반드시의 상위 클래스의 생성자를
	호출해야함. super()를 통해 호출하며, 상위 클래스의 생성자를 호출할 수 있음
	*/
	
	public 강아지(String 이름) {
		super(이름);
	}
	
	/*@Override
	- 부모클래스에서 부모가 가진 메서드를 재작성하거나 수정해서 정의 내릴 때 사용
	- 필수로 작성해야하는 건 아니지만 작성을 해줌으로써 부모클래스에서 가져와서
	수정했다는 업계표시
	*/
	
	
	//강아지 소리
	@Override
	public void 소리() {
		System.out.println(이름 + "이(가) 멍멍 짖습니다.");
	}
	
	
	
	
}
