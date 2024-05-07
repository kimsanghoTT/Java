package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book book1 = new Book();
		
		book1.title = "그것이 알고 싶다.";
		book1.author = "박진아";
		book1.publisher = "SBS";
		book1.inform();
	
		Book book3 = new Book("자바 프로그래밍 입문", "이지스퍼블리싱", "박은종", 25000, 0.1);
		
		book3.inform();
		
		
	}

}
