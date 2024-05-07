package com.kh.loop.ex;

public class LoopFor {
	/*
	 for : 끝이 정해져있는 반복을 진행할 때 사용하는 제어문
	 특정 조건을 만족하는 동안 {}안 코드 블록을 반복해서 실행
	 반복 횟수가 일정하게 정해진 경우 많이 사용
	 
	 사용 예제
	 for(초기식; 조건식; 증감식){
	 
	 	조건이 충족될 때 까지 반복해서 실행하는 공간
	 	조건이 맞지 않게 되면 for문을 탈출
	 }
	 int i = 1;
	 for(i ; i <=2 ; i++){
	 		System.out.println("i의 값 : " + i);
	 		=> i가 에러남. i자리에 "int i = 1;"이 모두 들어오기 때문
	 		=>;이 두개가 붙어버림
	 }	
	 for(초기 식의 값이기 때문에 i라고 작성불가.
	 		=>지정값 변수명 = 변수의 첫 값; 조건; 증감식)
	 
	 for-each문
	 - 배열이나 반복가능한 모든 값에 대해 반복적으로 작업할 때 사용하는 반복문
	 - 조건의 반복이 처음부터 끝까지 계속 반복
	 
	 사용 예제
	 
	 for(자료형 new변수명 : 배열 or 반복해서 보여주려는 변수명) {
	 	//실행하고자 하는 작업
	 	System.out.println(new변수명 작성);
	 }
	 
	 
	 
	 
	 
	 
	 */
	public static void main(String[] args) {

		for(int i = 1; i<=2; i++) {
			System.out.println(i);
			
		}
		System.out.println("====== for문 2번 ======");
		
		for(int a = 1; a<=3; a++) {
			System.out.println("a의 값 : " + a);
		}
		System.out.println("====== for문 3번 ======");
		//int num = 1;
		//num의 값 1~5까지 출력
		for(int num = 1; num<6; num++) {
			System.out.println("num의 값 : " + num);
		}
		System.out.println("====== for문 4번 ======");
		//1~10까지 짝수만
		for(int num = 2; num <= 10; num+=2) {
			System.out.println("num의 값 : " + num);
		}
		System.out.println("====== for문 5번 ======");
		//구구단 5단 출력
		int dan = 5;
		for(int i = 1; i<=9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		System.out.println("====== for문 6번 ======");
		//구구단 3단 출력
		
		int dan2 = 3;
		for(int num = 1; num<=9; num++) {
			System.out.println(dan2 + " X " + num + " = " + (dan2 * num));
		}
		
		
	}
}
