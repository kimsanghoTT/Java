package com.kh.interfaceEx;

public interface 계산기 {

	//필드
	// final의 경우 변하지 않는 상수이기 때문에 변수명은 모두 대문자로 작성
	double PI = 3.14;
	int 최소값 = -100_000_000;
	int 최대값 = 100000000;
	
	//전달받은 두 정수의 합, 차, 곱, 나눗셈 - 사용해달라고 작성만 해두고 계산식을 넣어두지 않음
	//미완성됐지만 다른데서 계산기를 불러올 때 필수로 불러와서 완성해줘야하는 메서드를 작성
	public abstract int 합(int a, int b);
	
	public abstract int 차(int a, int b);
	
	public abstract int 곱(int a, int b);
	
	public abstract double 몫(int a, int b);
	
	public abstract int 나머지(int a, int b);
}
