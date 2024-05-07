package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		while(true){
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			
			case 1:
				fileSave();
				break;
				
			case 2:
				fileOpen();
				break;
				
			case 3:
				fileEdit();
				break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
			}
		}
	}
	
	public void fileSave() {
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		
		//이미 파일이 존재한다면
		if(fc.checkName(fileName)) {
			System.out.println("파일이 이미 존재합니다.");
		}
		else {
			System.out.print("작성할 내용 입력 : ");
			String content = sc.nextLine();
			fc.fileSave(fileName, new StringBuilder(content));
		}
	}
	
	public void fileOpen() {
		System.out.print("열어줄 파일 이름 입력하기 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		System.out.println("파일 내용 : " + fileContent);
		

		
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 이름 입력하기 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		
		System.out.println("현재 내용 : " + fileContent);
		System.out.print("새로운 내용 입력 : " );
		String newContent = sc.nextLine();
		fc.fileEdit(fileName, new StringBuilder(newContent));
	}
} 
