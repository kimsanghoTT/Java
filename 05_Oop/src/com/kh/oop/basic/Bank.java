package com.kh.oop.basic;

public class Bank {
	//이름 계좌번호 잔액 비밀번호 마케팅수신동의
	public String name;
	public String accountNumber;
	public int balance;
	public String password;
	public boolean agree;
	
	//생성자 메서드
	//1. 필수가 아닌 생성자 = 클래스명 같아야함
	public Bank() {}
	//2. 필수 생성자 (이름, 계좌번호, 잔액, 비밀번호)
	public Bank(String 이름, String 계좌, int 잔액, String 비번) {
		this.name = 이름;
		this.accountNumber = 계좌;
		this.balance = 잔액;
		this.password = 비번;
	}
	
	//출력 메서드
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("계좌번호 : " + accountNumber);
		System.out.println("잔액 : " + balance);
		System.out.println("비밀번호 : " + password);
		System.out.println("마케팅수신동의 : " + agree);
		

	}
	//메인 출력 메서드
	public static void main (String[] args) {
		
		Bank client = new Bank("김상호", "650055-01-523456", 20000000, "9835");
		
		//client.agree = false;
		//boolean의 기본값은 false
		client.info();
		
		Bank client2 = new Bank("마이클", "3333-1111-44523", 400000000, "9778");
		
		client2.agree = true;
		
		client2.info();
		
		
		
	}
}
