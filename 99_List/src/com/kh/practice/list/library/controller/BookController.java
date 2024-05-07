package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

	private ArrayList<Book> list = new ArrayList<>();
	
	public BookController() {

		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암 정복기", "박신우", "의료", 21000));
		
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public void selectList() {
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		}
		else {
			for(Book book : list) {
				System.out.println(book.toString());
			}
		}
	}
	
	public void searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>();
		for(Book book : list) {
			if(book.getTitle().contains(keyword)) {
				searchList.add(book);
			}
		}
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			for(Book b : searchList) {
			System.out.println(b);
			}
		}
	}
	
	public void deleteBook(String title, String author) {
		//true, false를 통해 삭제가 됐는지 확인
		boolean removed = false;
		//책 제목과 저자를 통해 삭제할 책 찾기
		for(Book book : list) {
			if(book.getTitle().equals(title) && book.getAuthor().equals(author)) {
				list.remove(book);
				removed = true;
				break;
			}	
		}
		if(removed) {
			System.out.println("도서 삭제가 완료되었습니다.");
		}
		else {
			System.out.println("해당 도서를 찾을 수 없습니다.");
		}
	
	}

	//ascending 오름차순
	public void ascBook() {
		//오름차순 기능 추가
		//sort : 리스트 목록을 오름차순 정렬
								//정렬하는 기준 : 책에서 책 제목
								// :: => 람다 표현식, Book 파일의 getTitle을 참조해서 사용
		Collections.sort(list, Comparator.comparing(Book::getTitle));
	}
}
