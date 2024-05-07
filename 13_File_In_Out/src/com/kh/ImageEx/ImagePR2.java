package com.kh.ImageEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ImagePR2 {

	public static void main(String[] args) {
		//바탕화면에 이미지폴더 / 동물이름.txt 만들기
		String 폴더경로 = System.getProperty("user.home") + "/Desktop";
										//폴더명을 작성할 떄마다 /가 존재하는지 확인
		File 이미지폴더 = new File(폴더경로 + "/이미지폴더");
		
		//만약에 이미지가 존재하는지 존재하지 않는지 확인
		
		이미지폴더.mkdir();
		
		//동물이름.txt 생성후 동물이름 작성
													
		try {										//, true : 이어서 작성
													//파일 이름에도 / 있는지 확인
			FileWriter 글쓰기 = new FileWriter(이미지폴더 + "/동물이름.txt");
			
			글쓰기.write("소\n고양이\n돼지\n토끼\n호랑이");
			글쓰기.close();//작업하고 난 후에 항상 작업하던 파일을 닫아줄 것
			System.out.println("글쓰기 완료");
			
			//좋아하는 동물 이름으로 폴더 이름 변경
			//FileWriter는 글쓰는건 편하지만 피일 이름을 비교하거나 다른 작업은 어려움
			File 원본파일 = new File(이미지폴더 + "/동물이름.txt");
			File 새로운이름 = new File(이미지폴더 + "/좋아하는동물이름.txt");

			//삭제하기
			
			//폴더 삭제 - 폴더 안에 파일이 존재한다면 폴더 삭제 불가능
			//따라서 폴더 안에 파일이 존재하는지 확인하는지 확인 해야함
			//배열을 이용해서 파일 목록을 받고 파일 목록이 없다면 삭제
			File 파일목록[] = 이미지폴더.listFiles();
			System.out.println("폴더 안의 파일 목록 보기 : " + 파일목록);
			
			//for-each : 배열이름 출력하기 위함
			for(File f : 파일목록) {
				System.out.println(f.getName());

			}
		
			//폴더, 파일 삭제
			//파일 먼저 다 삭제하고 폴더 삭제
			
			원본파일.delete();
			새로운이름.delete();
			if(이미지폴더.delete()) {
				System.out.println("폴더 삭제 성공");
			}
			else {
				//만약에 폴더가 열려있거나 사용중이면 삭제 안됨
				//폴더 안에 숨겨진 파일이 있을 경우
				// -> 삭제 권한 문제가 있을 수 있음
				System.out.println("폴더 삭제 실패");
			}
			
			
			if(원본파일.renameTo(새로운이름)) {
				System.out.println("파일이름 변경 성공");
				
			}
			else {
				System.out.println("파일이름 변경 실패");
			}
			
		} catch (IOException e) {
			
			System.out.println("동물이름 작성 실패");
			
			e.printStackTrace();
		}
		


		
		
	}
}
