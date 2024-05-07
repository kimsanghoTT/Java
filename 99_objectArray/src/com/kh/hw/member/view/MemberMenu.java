package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		while(true) {
			System.out.println("최대 등록 가능한 회원의 수는 10명입니다.");
			System.out.println("현재 등록 가능한 회원의 수는 " + (10-mc.existMemberNum()) + "명 입니다.");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: 
				insertMember();
				break;
			
			case 2:
				searchMember();
				break;
				
			case 3:
				updateMember();
				break;
			
			case 4: 
				deleteMember();
				break;
			
			case 5:
				printAll();
				break;
				
			case 9: 
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default :
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertMember() {
		
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		if(id.equals(mc.checkId(id))) {
			System.out.println("이미 존재하는 ID입니다.");
			return;
		}
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		System.out.println("이메일 : ");
		String email = sc.nextLine();
		System.out.println("성별 M/F : ");
		char gender = sc.next().charAt(0);
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		mc.insertMember(id, name, password, email, gender, age);
		System.out.println("회원 등록이 완료되었습니다.");
	}
	
	public void searchMember() {
		while(true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			
			case 1:
				searchId();
				break;
				
			case 2:
				searchName();
				break;
				
			case 3:
				searchEmail();
				break;
				
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			
			}
		}
	}
	
	public void searchId() {
		System.out.println("검색할 아이디 : ");
		String id = sc.nextLine();
		String result = mc.searchId(id);
		System.out.println("찾으신 회원 검색 결과입니다.");
		System.out.println(result);
					
	}
	
	public void searchName() {
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		for(int i = 0; i<mc.existMemberNum(); i++) {
			if(mc.printAll()[i].getName().equals(name)) {
				System.out.println("찾으신 회원 검색 결과입니다.");
				System.out.println(mc.printAll()[i].inform());
			}
		}
	}
	
	public void searchEmail() {
		System.out.println("검색할 이메일 : ");
		String email = sc.nextLine();
		for(int i = 0; i<mc.existMemberNum(); i++) {
			if(mc.printAll()[i].getEmail().equals(email)) {
				System.out.println("찾으신 회원 검색 결과입니다.");
				System.out.println(mc.printAll()[i].inform());
			}
		}
	}
	
	public void updateMember() {
		while(true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2.이름 수정하기");
			System.out.println("3.이메일 수정하기");
			System.out.println("9.메인으로 돌아가기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				updatePassword();
				break;
				
			case 2:
				updateName();
				break;
				
			case 3:
				updateEmail();
				break;
				
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
				
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
			
		}

	}
	
	public void updatePassword() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.println("수정할 비밀번호 : ");
		String password = sc.nextLine();
		boolean result = mc.updatePassword(id, password);
			if(result) {
				System.out.println("비밀번호 수정이 성공적으로 되었습니다.");
			}
			else {
				System.out.println("해당 ID를 찾을 수 없습니다.");
			}
	}
	
	public void updateName() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.println("수정할 이름 : ");
		String name = sc.nextLine();
		boolean result = mc.updateName(id, name);
			if(result) {
				System.out.println("이름 수정이 성공적으로 되었습니다.");
			}
			else {
				System.out.println("해당 ID를 찾을 수 없습니다.");
			}
		
	}
	
	public void updateEmail() {
		System.out.println("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.println("수정할 이메일 : ");
		String email = sc.nextLine();
		boolean result = mc.updateEmail(id, email);
			if(result) {
				System.out.println("이메일 수정이 성공적으로 되었습니다.");
			}
			else {
				System.out.println("해당 ID를 찾을 수 없습니다.");
			}
	}
	
	public void deleteMember() {
		while(true) {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1: 
				deleteOne();
				break;
				
			case 2:
				deleteAll();
				break;
				
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
				
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}

	}
	
	public void deleteOne() {
		System.out.println("삭제할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.println("정말로 삭제하시겠습니까? (y/n) : ");
		char choice = sc.next().charAt(0);
		boolean result = mc.delete(id);
		if(choice == 'y' || choice == 'Y') {
			if(result) {
				System.out.println("회원이 삭제되었습니다.");
			}
			else {
				System.out.println("해당 ID를 찾을 수 없습니다.");
			}
		}
		else if(choice == 'n' || choice == 'N') {
			return;
		}
		
	}
	
	public void deleteAll() {
		mc.delete();
		System.out.println("전체 회원이 삭제되었습니다.");
	}

	public void printAll() {
		Member members[] = mc.printAll();
		for(int i = 0; i< mc.existMemberNum(); i++) {
			System.out.println(members[i].inform());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
