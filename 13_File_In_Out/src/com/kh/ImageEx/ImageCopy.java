package com.kh.ImageEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
	이미지를 복사하기 위해서는 원본 이미지 파일 경로와
	옮기고 싶은 이미지 파일 경로를 설정

	File
	- 파일을 읽고, 쓰고, 가져오고, 사용하는데 쓰이는 객체
	
	
	FileInputStream
	- 파일의 데이터를 읽어오는데 사용
	- read() : 데이터를 읽어옴
	

	
	FileOutputStream
	- 파일의 데이터를 내보내는데 사용
	- write() : 데이터를 사용
*/	

public class ImageCopy {

	public static void main(String[] args) {
		//healing 복사
		//힐링이의 사진이 위치하고 있는 장소를 작성
		//java에서 폴더 구분을 작성할 때는 /로 작성
		//모든 파일의 실행은 src로부터 시작함
		//폴더 경로를 모두 쓰고 파일이름.확장자 작성
		String 원본이미지 = "src/com/kh/ImageEx/healing.jpg";
		String 복사이미지 = "src/com/kh/ImageEx/healing_cute.jpg";
		
		//FileInputStream / FileOutputStream 사용해서 읽고 쓰기
		try {
			FileInputStream 파일읽기 = new FileInputStream(원본이미지);
			FileOutputStream 파일쓰기 = new FileOutputStream(복사이미지);

			//버퍼를 통해 데이터를 읽고 쓰기위한 배열 설정
			byte[] buffer = new byte[1024];
			int 길이;
			
			//배열에 담은 버퍼를 통해 원본 파일로부터 데이터를 읽어와 복사할 파일에 사용
			//while문을 사용해서 이미지 0부터 끝까지 가지고 옴
			while((길이 = 파일읽기.read(buffer)) > 0) {
				파일쓰기.write(buffer, 0, 길이);
			}
			//파일 읽고 쓴 다음 종료하기
			파일읽기.close();
			파일쓰기.close();
			System.out.println("이미지 복사가 완료되었습니다.");
			
			

		} catch (Exception e) {

			System.out.println("이미지 복사중 오류가 발생");
			e.printStackTrace();
		}
		
		
		
		
	}
}
