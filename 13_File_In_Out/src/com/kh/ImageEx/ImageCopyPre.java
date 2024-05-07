package com.kh.ImageEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ImageCopyPre {

	public static void main(String[] args) {
		
		//원본이미지 hogam  / 복사이미지 hogam_cute
		
		String 원본이미지 = "src/com/kh/ImageEx/hogam.jpg";
		String 복사이미지 = "src/com/kh/ImageEx/hogam_cute.jpg";
		
		
		try {
			FileInputStream 읽기 = new FileInputStream(원본이미지);
			FileOutputStream 쓰기 = new FileOutputStream(복사이미지);
			
			byte[] buffer = new byte[1024];
			int length;
						//읽기에서 buffer를 읽음
			while((length = 읽기.read(buffer)) > 0 ) {
						//buffer배열의 인덱스0부터 length(끝까지)까지 가져옴
				쓰기.write(buffer, 0, length);
			
			}
			//파일 스트림 닫아주기
			읽기.close();
			쓰기.close();
			System.out.println("이미지 복사가 완료되었습니다.");
			
		} catch (Exception e) {

			System.out.println("이미지 복사 실패");
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
