package com.kh.practice.list.music.view;

import java.util.*;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				addList();
				break;
				
			case 2:
				addAtZero();
				break;
				
			case 3:
				printAll();
				break;
				
			case 4:
				searchMusic();
				break;
				
			case 5:
				removeMusic();
				break;
				
			case 6:
		//		setMusic();
				break;
				
			case 7:
		//		ascTitle();
				break;
				
			case 8:
		//		descSinger();
				break;
				
			case 9:
				System.out.println("종료");
				return;
				
			}
		}

	}
	
	public void addList() {
		System.out.println("******* 마지막 위치에 곡 추가 *******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		mc.addList(title, singer);
		


	}
	
	public void addAtZero() {
		System.out.println("******* 첫 번째 위치에 곡 추가 *******");
		System.out.print("곡 명 : ");
		String name = sc.nextLine();
		sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music music = new Music(name, singer);
		int result = mc.addAtZero(music);
		
		if(result == 1) {
			System.out.println("첫 번째 자리에 곡이 추가되었습니다.");
		}
		else {
			System.out.println("첫 번째 자리에 곡 추가에 실패했습니다.");
		}
	}
	
	public void printAll() {
		System.out.println("******* 전체 곡 출력 *******");
		for(Music music : mc.printAll()) {
			System.out.println(music);
		}
	}
	
	public void searchMusic() {
		System.out.println("******* 특정 곡 검색 *******");
		System.out.print("검색할 곡 명: ");
		String title = sc.nextLine();
		sc.nextLine();
		
		System.out.println(mc.searchMusic(title));
	}
	
	public void removeMusic() {
		System.out.println("******* 특정 곡 삭제 *******");
		System.out.print("삭제할 곡 명: ");
		String title = sc.nextLine();
		sc.nextLine();
		
		System.out.println(mc.removeMusic(title));
	}
	
	public void setMusic() {
		System.out.println("******* 특정 곡 수정 ********");
		System.out.println("수정할 곡명 입력 : ");
		String title = sc.nextLine();
		System.out.println("새로운 가수명 입력 : ");
		String singer = sc.nextLine();
		System.out.println(mc.setMusic(title, singer));
	
	}
	
	public void ascTitle() {
		mc.ascTitle();
		System.out.println("곡명을 오름차순으로 정렬했습니다.");
	}
	
	public void descSinger() {
		mc.descSinger();
		System.out.println("가수명을 내림차순으로 정렬했습니다.");
		
	}	
		
		
		
		
		
		
		
		
	
}
