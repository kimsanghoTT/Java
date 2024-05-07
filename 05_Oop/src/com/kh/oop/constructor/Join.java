package com.kh.oop.constructor;

public class Join {

	//1. 회원가입
	
	//필드 - 회원번호, 아이디, 이름, 연락처
	public int memberNo;
	public String memberId;
	public String memberName;
	public String phoneNumber;
	
	//기본,필수 생성자
	
	public Join() {}
	
	public Join(int memberNo, String memberId, String memberName, String phoneNumber) {
		//필드에 있는 memberNo에 나중에 작성한 memberNo를 넣음
		this.memberNo=memberNo;
		this.memberId=memberId;
		this.memberName=memberName;
		this.phoneNumber=phoneNumber;
	}
	
	//메서드 - 클래스 안에 존재하고 특정 기능을 할 수 있도록 묶어놓은 코드 모음
	//void 메서드 - 결과 값을 전달하지 않음
	public void memberInfo() {
		System.out.println("멤버 번호 : " + memberNo);
		System.out.println("멤버 아이디 : " + memberId);
		System.out.println("멤버 이름 : " + memberName);
		System.out.println("멤버 전화번호 : " + phoneNumber);
		System.out.println("=================================");
	}
	
	public static void main(String[] args) {
		
		System.out.println("========= kh 쇼핑 회원 정보 확인 =========");
		
		Join member = new Join();
		//필수가 없음
		member.memberId = "qwert";
		member.memberName = "김상호";
		member.memberNo = 5;
		member.memberInfo();
		
		//필수가 있음
		Join member2 = new Join(5, "qwert", "김상호", "000-0000-0000");
		
		member2.memberInfo();
		
		//member4 member5 회원가입시킴
		//member4 : 기본생성자로 가입시키기 - 멤버번호, 이름
		Join member4 = new Join();
		
		member4.memberNo = 3;
		member4.memberName = "배트맨";
		
		member4.memberInfo();
		
		
		Join member5 = new Join(5, "슈퍼맨", "딘 케인", "010-1938-1932");
		
		member5.memberInfo();
		
		
		
	}

}
