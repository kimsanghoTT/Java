package com.kh.practice.chap01_poly.model.vo;

public class Member {

	private String name; //회원명
	private int age; //나이
	private char gender; //성별
	private int couponCount = 0;//요리학원쿠폰개수
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
	

	@Override
	public String toString() {
		return "Member 이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender
				+ "쿠폰 갯수 : " + couponCount;
	}


	
}
