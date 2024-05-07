package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
	외부 아이피 주소를 알아봄
	
	내 집 주소 알아보기
	InetAddress.getLocalHost() : 현재 내 컴퓨터에 지정된 IP주소를 가져오는 메서드
	192.168.0.1 기반
	
	내 IP 주소 : 192.168.0.36 localhost 127.0.0.1
	- 기본으로 처음에 컴퓨터가 동일한 선에서 1대일 때는 192.168.0.1 -> 마지막이 1인 숫자를 받음
	- 여러사람이 함께 동일한 장소, 선, 네트워크를 나눠서 받게될 경우에는 1부터 차례대로 번호가 부여받게 됨
	
	내 컴퓨터 실제 주소를 알고 싶다면 네이버 검색창에 ip주소 검색 및 확인
	192.168.0.36의 경우 내 집에 있는 호수를 가리켜서 사용

	우리집을 나타내는 숫자주소 = 127.0.0.1 / localHost = 192.168.0.36
*/
public class AddressEx2 {

	public static void main(String[] args) {
		try {
			InetAddress 로컬호스트 = InetAddress.getLocalHost();
			System.out.println("내 IP주소 : " + 로컬호스트.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
