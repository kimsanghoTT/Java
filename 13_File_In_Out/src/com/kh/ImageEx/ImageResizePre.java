package com.kh.ImageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	
	
	
	public static void main(String[] args) {
		//원본이미지 pig.jpg -> pig_cute.jpg /가로 400 세로 200
		
		String originalImage = "src/com/kh/ImageEx/pig.jpg";
		String fixedImage = "src/com/kh/ImageEx/pig_cute.jpg";
		
		int 가로 = 400;
		int 세로 = 200;
		
		
		try {
		//원본이미지 데이터를 버퍼 이미지로 읽어들임
		BufferedImage oriData = ImageIO.read(new File(originalImage));
		
		//새로운 크기 이미지 생성
		BufferedImage imageBuffer = new BufferedImage(가로, 세로, BufferedImage.TYPE_INT_RGB);
		
		//이미지 크기 조정해서 새로운 이미지에 그림
		Image drawingImage = oriData.getScaledInstance(가로, 세로, Image.SCALE_SMOOTH);
		
		//이미지 그리기 시작
		imageBuffer.createGraphics().drawImage(drawingImage,0,0,null);
		
		
		//새로운 이미지 파일로 저장
		ImageIO.write(imageBuffer, "jpg", new File(fixedImage));
		System.out.println("수정완료");
		
		}
		catch(IOException e) {
			
			
			e.printStackTrace();
		}
		
		
		
	}

}
