package com.kh.ExceptionEx;

/*	Exception에서 try catch finally

	try {
		//예외가 발생할 수 있지만 실행하는 코드
		
	}catch(Exception e) {
		//예외가 생겨서 출력하는 실행하는 코드
			
	}finally {
		// 예외 발생과 상관없이 무조건 실행하는 코드
		// 파일 닫기, 연결 종료 등
	}
*/

public class ExceptionFinallyEx {

	public static void main(String[] args) {
		
		try {
			int 결과 = 10 /0;
			
		} catch (Exception e) {
			System.out.println("0은 안됩니다.");
			
		}finally {
			System.out.println("전 이만~");
		}
		
		try {
			
		} finally {
			// TODO: handle finally clause
		}

	}
}
