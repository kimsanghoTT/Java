package com.kh.PropertiesEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/*
	Properties : 속성 또는 설정. 필히 넣어야하는 값을 작성
	- Map이랑 비슷한 형태의 데이터를 관리하는 데 사용
	- key(키)와 value(값)으로 이루어져 있음
	- 키와 값이 숫자가 아니라 문자열인 형태로 가지고 있음
	
	메서드
	- setProperty(String key, String value) : 지정된 키와 값으로 맵에 항목을 추가
	- getProperty(String key) : 주어진 키에 대한 값을 반환
	- getProperty(String key, String value) : 주어진 키에 대한 값을 전달.
												해당 키가 없을 경우 기본값을 반환
	- load(InputStream in) : 입력 스트림에서 속성 목록을 읽어옴
	- store(OutputStream out, String comment) : 출력스트림에서 속성 목록을 저장
	
	properties의 경우에는 프로그램이나 코드를 실행할 때 필수로 설정해줘야하는 내용을 작성한 후
	코드가 아니라 파일로 주로 존재
	
	map은 주로 데이터를 다루지만 properties의 경우 인증키나 회원에게 인증번호를 보내고
	인증을 위해 필요한 내용을 작성해놓는 공간
*/

public class PropertiesEx {

	public static void main(String[] args) {
		//properties 객체 생성
		Properties 설정 = new Properties();
		
		
		try {
			//File
			File 리얼파일만들기 = new File("설정.properties");
			
			//만약에 파일이 존재하지 않는다면 파일만들어주기
			if(리얼파일만들기.exists()) {
				System.out.println("파일이 존재합니다.");
			}
			else {
				System.out.println("설정 파일이 없습니다. 새로운 파일을 생성해주세요");
				리얼파일만들기.createNewFile();
			}
			
			
			//설정파일 만들기 / 만약에 이미 만들어둔 설정.properties이 없다면 새 파일이 만들어짐
			FileInputStream 파일불러오기 = new FileInputStream("설정.properties");
			설정.load(파일불러오기); // 파일만들기 대기
			파일불러오기.close(); // 파일만들기 끝
			
			//관리자이름 비밀번호를 가져오기
			//만약 관리자 이름과 비번이 없다면 null값으로 설정되어 나올 것
			String 관리자이름 = 설정.getProperty("관리자이름");
			String 관리자비번 = 설정.getProperty("관리자비번");
			
			System.out.println("관리자이름 : " + 관리자이름);
			System.out.println("관리자비번 : " + 관리자비번);
			
			//만약 null값으로 아무런 값도 없는 것이 싫다면 설정값을 변경 가능
			설정.setProperty("관리자이름", "매니저");
			설정.setProperty("관리자비번", "1234");
			
			//변경된 설정을 파일에 저장
			FileOutputStream 파일저장 = new FileOutputStream("설정.properties");
			
			//새로운 내용 저장/ 저장할 때 어떤 내용을 수정, 삭제, 추가하는지 작성
			설정.store(파일저장, "새로운 이름과 비번 저장");
			
			//파일저장종료
			파일저장.close();
			
			System.out.println("관리자가 성공적으로 변경되었습니다.");
			
			
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다");
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
