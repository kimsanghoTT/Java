package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		
		Member newbie = new Member();
		newbie.memberId = "Hong";
		newbie.memberPwd = "1111"; 
		newbie.age = 13;
		newbie.gender = '남';
		newbie.phone = "010-1234-5678";
		newbie.email = "qwert8595@naver.com";
		newbie.changeName("홍길동");
		newbie.printName();
		//null : 안에 어떠한 값도 들어있지 않음
	}

}
