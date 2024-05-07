package com.kh.practice.charCheck.exception;

public class CharCheckException extends Exception{

	public CharCheckException() {
		super();
	}
	//필수 생성자 : 어떠한 문자가 들어오면 Exception 참조해서 처리하겠다
	public CharCheckException(String msg) {
		super(msg);
	}
}
