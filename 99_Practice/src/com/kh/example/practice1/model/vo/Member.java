package com.kh.example.practice1.model.vo;

public class Member {

	public String memberId;
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	public Member(){}
	
	
	public void changeName(String name) {
		this.memberName = name;
	}
	//전달 메서드
//	public String changeEmail(String email) {
//		return email;
//	}
	public void printName() {
		System.out.println("멤버 ID : " + memberId + "\n멤버 비밀번호 : "
				+ memberPwd + "\n멤버 이름 : " + memberName + "\n나이 : " +age + "\n성별 : "
				+ gender + "\n번호 : " + phone + "\n이메일 : " + email);
	}
	
}
