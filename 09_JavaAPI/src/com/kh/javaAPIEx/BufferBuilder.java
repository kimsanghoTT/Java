package com.kh.javaAPIEx;
/*
	String : 변할 수 없음.
	문자나 문자열을 사용한 후 변수명에 다른 값을 넣어주는 것이지 수정하거나 삭제하는 건 힘듦
	
	
	- 메모리 크기가 변할 수 있는 환경 / 수정, 삭제해도 문제 없음
	StringBuffer : 여러 쓰레드에서 동시에 사용되어도 안전하게 작업을 처리 (동기화)
	StringBuilder : 하나의 쓰레드에서 사용하는 것이 효율(비동기, 추천)
	
	스레드(Thread) : 컴퓨터 내에서 실행되는 독립적인 실행 흐름
	동기 : 요청과 결과가 동시에 일어나는 것
	비동기 : 요청과 결과가 한 자리에서 동시에 일어나지 않는 것
	
	
*/	
	
public class BufferBuilder {

	//바로 실행하고 출력하고 싶을 때 -> main
	public static void main(String[] args) {
		//1. StringBuffer
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello");
		buffer.append(" World");
		System.out.println(buffer.toString());
		
		//StringBuilder
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append(" World");
		System.out.println(builder.toString());
	}

}
