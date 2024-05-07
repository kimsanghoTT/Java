package com.kh.FileEx;

import java.io.File;
import java.io.IOException;

public class FilePre {
	public FilePre() {
		// TODO Auto-generated constructor stub
	}
	
	public void method1() {
		File 텍스트파일 = new File("c:/Users/user1/Desktop/newFFF/파일생성.txt");
		
		if(텍스트파일.exists()) {
			System.out.println("파일이 존재합니다.");
		}
		else {
			//만약에 파일 만들기 성공했다면
			try {
				텍스트파일.createNewFile();
				System.out.println(텍스트파일.getName());
				System.out.println(텍스트파일.getPath());
				System.out.println("파일 생성 완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 만들기 실패");
				e.printStackTrace();
			}
	
		}
		
	}
	
	public void method2() {
		//바탕화면에 뉴폴더라는 폴더 생성하고, 뉴폴더 안에 파일생성.txt 만들기
		
		File 폴더만들기 = new File("c:/Users/user1/Desktop/뉴폴더");
		
		//바탕화면 경로를 설정하는 방법				c:/Users/user1
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		
		
		
		if(폴더만들기.exists()) {
			System.out.println("이미 해당 폴더가 존재합니다.");
		}
		else {
			
			폴더만들기.mkdir();
			System.out.println(폴더만들기.getName() + "생성 완료");

		}
		File 파일만들기 = new File("c:/Users/user1/Desktop/뉴폴더/파일생성.txt");
		
		if(파일만들기.exists()) {
			System.out.println("이미 해당 파일이 존재합니다");
		}
		else {
			try {
				파일만들기.createNewFile();
				System.out.println(파일만들기.getName() + "생성 완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("생성 실패");
				e.printStackTrace();
			}
		}
	}
	
	public void method3() {
		
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		
		//모든 폴더 생성
		File 폴더들 = new File(바탕화면경로 + "뉴1/뉴2/뉴3");
		폴더들.mkdirs();
		
		//파일 생성
		File 파일 = new File(폴더들 + "/새로운파일.txt");
		try {
			boolean 파일생성확인 = 파일.createNewFile();
			System.out.println("파일 생성 ? : " + 파일생성확인);
			
			//파일 크기 확인
			System.out.println(파일.length());
			
			//마지막 수정일 확인
			System.out.println(파일.lastModified());
			
			//파일 삭제
			파일.delete();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 생성 실패");
			e.printStackTrace();
		}
		
		
	}
	
	public void method4() {
		//파일 이름 변경
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		File 파일 = new File(바탕화면경로 + "/newFFF/파일생성이름바꾸기.txt");
		try {
			파일.createNewFile();
			System.out.println("파일이 생성되었습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void method5() {
		
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		File 텍스트파일 = new File(바탕화면경로 + "/newFFF/파일생성.txt");
		File 새로운이름 = new File(바탕화면경로 + "/newFFF/변경된이름.txt");
		
		//파일이름 바꾸기
		//만약 파일이 존재할 경우 -> 파일 이름 변경 존재하지 않으면 변경 x
		if(텍스트파일.exists()) {
			if(텍스트파일.renameTo(새로운이름)) {
				System.out.println("성공적으로 변경되었습니다.");
			}
			else {
				System.out.println("이름 변경에 실패했습니다.");
			}
		}
		else {
			System.out.println("파일이름이 존재하지않습니다");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		FilePre 파일 = new FilePre();
	//	파일.method1();
	//	파일.method2();
	//	파일.method3();
	//	파일.method4();
		파일.method5();
		
	}
}
