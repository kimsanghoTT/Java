package com.kh.practice.book.view;

import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	
	Scanner sc = new Scanner(System.in);
	
	BookController bc = new BookController();
	
	Book[] bArr = new Book[3];
	
	public BookMenu() {

		bc.makeFile();
		for(Book b : bArr) {
			b = bc.fileRead();
		}
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				fileSave();
				break;
				
			case 2:
				fileRead();
				break;
			}
		}
	
	}
	
	public void fileSave() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String date = sc.nextLine();
		
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		
		date.split(",");
		for(Book b : )

		
		
	}
	
	public void fileRead() {
		
	}
	
	
}
