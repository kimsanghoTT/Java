package com.kh.ExceptionEx;

import java.util.Scanner;

/*
	Exception : 예외

	try{ // 예외를 발생 시킬 수 있지만 시도하고 싶은 코드를 작성하는 공간
	
	}catch(Exception e){
		//예외가 발생했을 때 보여줄 코드나 문구를 작성
	}
	
	- catch문은 무제한으로 작성할 수 있음
	catch를 여러개 쓸 경우
	
	catch(배열Exception e)
	...
	catch(Exception e)을 맨 마지막에 작성 해줌
*/
public class ExceptionEx {

	private Scanner sc = new Scanner(System.in);
	
	//기본 생성자
	public ExceptionEx() {
		// TODO Auto-generated constructor stub
	}
	
	
	//메서드 2개 만들고
	public void method1() {
		int[] 배열 = {10, 20, 30, 40};
		
		for(int i=0; i<=배열.length; i++) {
			
			try {
			System.out.println(배열[i]);
			
			}catch(RuntimeException e) {
				
				System.out.println("1번 예외상황");
				
				
				
			}catch(Exception e) {
				System.out.println("배열의 인덱스를 벗어났습니다.");
			}
		}
	}
	
	//메인 메서드
	public static void main(String[] args) {
		ExceptionEx 예외발생 = new ExceptionEx();
		
		예외발생.method1();
	}
}
