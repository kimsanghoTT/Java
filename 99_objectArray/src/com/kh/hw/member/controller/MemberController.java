package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	private Member[] mArr = new Member[SIZE];
	private int memberCount = 0;
	
	public int existMemberNum() {
		return memberCount;
	}
	
	public boolean checkId(String inputId) {
		for(int i = 0; i<memberCount; i++) {
			if(mArr[i].equals(inputId)) {
				return true;
			}
		}
		return false;
	}
	
	public void insertMember(String id, String name, String password
			, String email, char gender, int age) {
		if(memberCount < SIZE) {
			mArr[memberCount++] = new Member(id, name, password, email, gender, age);
			
		}
		else {
			System.out.println("더 이상 회원을 추가할 수 없습니다.");
		}
	}
	
	public String searchId(String id) {
		for(int i = 0; i < memberCount; i++) {
			if(mArr[i].getId().equals(id)) {
				return mArr[i].inform();
			}
			
		}
		return "해당 ID의 회원이 존재하지 않습니다.";
	}
	
	public Member[] searchName(String name) {
		  Member result[] = new Member[SIZE];
	        int count = 0;
	        for (int i = 0; i < memberCount; i++) {
	            if (mArr[i].getName().equals(name)) {
	                result[count++] = mArr[i];
	            }
	        }
	        return result;
	}
	
	public Member[] searchEmail(String email) {
		Member result[] = new Member[SIZE];
			int count = 0;
			for(int i = 0; i <memberCount; i++) {
				if(mArr[i].getEmail().equals(email)) {
					result[count++] = mArr[i];
				}
			}
			return result;
	}
	
	public boolean updatePassword(String id, String password) {
		for(int i = 0; i < memberCount; i++) {
			if(mArr[i].getId().equals(id)) {
				mArr[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateName(String id, String name) {
		for(int i = 0; i < memberCount; i++) {
			if(mArr[i].getId().equals(id)) {
				mArr[i].setName(name);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateEmail(String id, String email) {
		for(int i = 0; i< memberCount; i++) {
			if(mArr[i].getId().equals(id)) {
				mArr[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String id) {
		for(int i = 0; i<memberCount; i++) {
			if(mArr[i].getId().equals(id)) {
				mArr[i] = mArr[memberCount -1];
				mArr[memberCount -1] = null;
				memberCount--;
				return true;
			}
		}
		return false;
		
	}
	
	public void delete() {
		
		mArr = new Member[SIZE];
		memberCount = 0;
		
	}
	
	public Member[] printAll() {
		Member result[] = new Member[memberCount];
		System.arraycopy(mArr, 0, result, 0, memberCount);
		return result;
	}

}
