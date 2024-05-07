package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			
			case 1:
				insertBook();
				break;
				
			case 2:
				selectList();
				break;
				
			case 3:
				searchBook();
				break;
				
			case 4:
				deleteBook();
				break;
				
			case 5:
				ascBook();
				break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
	
		}

	}
	
	public void insertBook() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("카테고리 : ");
		String category = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
		System.out.println("도서 추가가 완료되었습니다.");
	}
	
	public void selectList() {
		bc.selectList();
	}
	
	public void searchBook() {
		System.out.print("검색할 키워드 입력 : ");
		String key = sc.nextLine();
		bc.searchBook(key);
	}
	
	public void deleteBook() {
		System.out.print("삭제할 도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		bc.deleteBook(title, author);
	}
	
	public void ascBook() {
		bc.ascBook();
	}
}
