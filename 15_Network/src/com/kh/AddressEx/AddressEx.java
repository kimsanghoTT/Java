package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
	IP 주소
	- 컴퓨터에서 네트워크의 특정 장치를 확인하는데 사용하는 숫자
	- 가장 기본 주소 : 192.168.0.1 = 로컬호스트(Local host)

	port
	- 네트워크에서 데이터를 주고받을 수 있는 장소
	- 타인의 컴퓨터나 도메인, 또는 특정위치에 들어갈 수 있는 2자리, 4자리 번호
		
	InetAddress
	- Java에서 IP주소를 나타내는데 사용
	- 호스트명과 IP주소간의 변환, 집주인에 대한 정보 검색등을 가능하게 해줌
	
	메서드
	- getByName(String host) : 'host'명에 대한 정보를 반환
	- getHostName() : 호스트명을 가져옴
	- getHostAddress() : IP주소를 가져옴
		
	
	호스트명 : www.google.com
	IP주소 : 172.217.27.4

	호스트명과 IP주소가 사람마다 각각 다른 이유
	: 호스트의 주인이 실제 본인의 IP주소를 보호하기 위해 임시로 보여주는 IP주소이기 떄문에 
	사람마다 다르게 나타남
		
		
*/
public class AddressEx {

	public static void main(String[] args) {
		//1. naver에 대해 알아보기
		try {//에러가 생길지 모르나 일단 시도해보는 것 : try
			InetAddress 주소 = InetAddress.getByName("www.naver.com");
			System.out.println("호스트명 : " + 주소.getHostName());
			System.out.println("IP 주소 : "  + 주소.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. daum에 대해 알아보기		
		try {
			InetAddress 주소2 = InetAddress.getByName("www.daum.net");
			System.out.println("호스트명 : " + 주소2.getHostName());
			System.out.println("IP 주소 : "  + 주소2.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. IP주소로 daum.net 검색하기
		try {
			InetAddress 다음IP = InetAddress.getByName("121.53.105.193");
			System.out.println("호스트명 : " + 다음IP.getHostName());
			System.out.println("IP 주소 : "  + 다음IP.getHostAddress());	
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
