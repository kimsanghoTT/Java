package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		Member member = new Member(name, age, gender);
		
		while(true) {
			System.out.println("==== 메뉴 선택 ====");
			System.out.println("1. 마이 페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			
			case 1:
				myInfo();
				break;
				
			case 2:
				selectAll();
				break;
				
			case 3: 
				searchBook();
				break;
				
			case 4:
				rentBook();
				break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default :
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void myInfo() {
		System.out.println(lc.myInfo());
	}
	
	public void selectAll() {
		Book bList[] = lc.selectAll();
		for(int i = 0; i<bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i]);
		}
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String key = sc.nextLine();
		Book searchList[] = lc.searchBook(key);
		for(Book a : searchList) {
			System.out.println(a);
		}
	}
	
	public void rentBook() {
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		
		switch(result) {
		
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
			
		case 1:
			System.out.println("나이 제한으로 대여가 불가능합니다.");
			break;
			
		case 2: 
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. "
					+ "마이페이지에서 확인하세요.");
			break;
			
		
		}
	}
}
