package com.kh.practice.chap01_poly.controller;

import java.util.Arrays;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	
	private Member mem = null;
	private Book bList[] = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한 번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		
	}
	
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
		
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book result[] = new Book[5];
		int count = 0;
		for(Book book : result) {
			if(book.getTitle().contains(keyword)) {
				result[count++] = book;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	 public int rentBook(int index) {
	        if (bList[index] instanceof AniBook) {
	            AniBook aniBook = (AniBook) bList[index]; //다운 캐스팅
	            if (mem.getAge() < aniBook.getAccessAge()) {
	                return 1;
	            }
	        } else if (bList[index] instanceof CookBook) {
	            CookBook cookBook = (CookBook) bList[index];
	            if (cookBook.isCoupon()) {
	                mem.setCouponCount(mem.getCouponCount() + 1);
	                return 2;
	            }
	        }

	        return 0;
	    }
	

}
