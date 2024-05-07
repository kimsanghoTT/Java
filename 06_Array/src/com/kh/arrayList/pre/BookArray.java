package com.kh.arrayList.pre;

public class BookArray {
	
	public static void main(String[] args) {
		//객체 배열
		Book[] books = new Book[3];
		
		books[0] = new Book("아몬드", "손원평");
		books[1] = new Book("불변의 법칙", "모건 하우철");
		books[2] = new Book("나는 읽고 쓰고 버린다", "손웅정");
		
		System.out.println(books); // 컴퓨터에서의 books 배열의 주소
		System.out.println("=====================================");
		for(Book 책 : books) {
			//for문의 경우 books 중에서 하나만 가져오기 떄문에
			//맨 앞 자료형에 배열을 붙이지 않음
			System.out.println(책); //books에서 '책' 하나씩의 주소
			System.out.println(책.getBookName()); 
			System.out.println(책.getAuthor()); 
		}
	}
}
