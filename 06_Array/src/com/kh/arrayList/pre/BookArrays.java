package com.kh.arrayList.pre;

import java.util.Arrays;

public class BookArrays {

	public static void main(String[] args) {

		Book[] books = new Book[3];
		
		
		books[0] = new Book("아몬드", "손원평");
		books[1] = new Book("불변의 법칙", "모건 하우철");
		books[2] = new Book("나는 읽고 쓰고 버린다", "손웅정");
		
		//책 정보 복사
		
		Book[] 무지개도서관 = Arrays.copyOf(books, books.length);
		
		//무지개 도서관 정보 출력
		
		System.out.println("=== 무지개 도서관 책 정보 ===");
		for(Book 책 : 무지개도서관) {
			System.out.println(책.getBookName() + ", " + 책.getAuthor());
		}
		boolean same = Arrays.equals(books, 무지개도서관);
		//books와 무지개도서관이 같은지 비교
		System.out.println("books와 무지개도서관이 같은가?" + same);
		
		//무지개도서관 주황도서관 책을 복사해서 가지고 옴
		Book[] 주황도서관 = Arrays.copyOf(books, 3);
		
		for(Book 책 : 주황도서관) {
			System.out.println(책.getBookName() + ", " + 책.getAuthor());
		}
	}

}
