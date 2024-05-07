package com.kh.LambdaEx;
/*
	람다식(Lambda)
	- 클래스식으로 구분해서 만드는 함수를 하나의 식으로 표현한 것
	- 메서드의 이름이 필요없기 때문에 이름이 없어서 익명 함수

	* 기존에 작성하던 방식
		public 반환타입(void or return) 메서드명(매개변수) {
			실행문
	}

	* 람다식
		(매개변수 목록) -> {실행될 코드 블록};
		(    ) -> "  ";
		(    ) -> {  };
		
	ex) 
	* 기존
	public String Hello() {
		return "World";
	}
	
	* 람다식
	() -> "World";
		
	람다식의 장점 : 코드를 간단하게 만들 수 있음
	
	람다식의 단점 : 람다식이 너무 많아지면 코드 사용의 구분이 어려움	
		
		
 	*/
	

public class LambdaEx {

	private static int 숫자 = 0;
	
	public void 기본식스레드() { //러너블연습.java와 러너블실행.java를 합침
		
		for(int i =0; i<3; i++) {
			Runnable r = new Runnable() {
				@Override
				public void run() {
					synchronized (LambdaEx.class) {
						숫자++;
						System.out.println("숫자 " + 숫자);
					}
				}
				
			};
			Thread t = new Thread();
			t.start();
		}
	}
	
	public void 람다스레드() {
		for(int i = 0; i<5; i++) {
			//러너블 인터페이스 생략
			//void run 생략
			Thread t = new Thread(() ->{ 
				synchronized (LambdaEx.class) {
					숫자++;
					System.out.println("숫자 : " + 숫자);
				}
			});
			t.start();
		}
	}
	
}
