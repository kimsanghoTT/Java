package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	public static void main(String[] args) {
		//www.google.com의 호스트명과 IP주소 가져오기
		try {
			InetAddress 구글 = InetAddress.getByName("www.google.com");
			System.out.println("호스트명 : " + 구글.getHostName());
			System.out.println("IP주소 : " + 구글.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//www.facebook.com 페이스북 호스트이름 호스트주소
		try {
			InetAddress 페북 = InetAddress.getByName("www.facebook.com");
			System.out.println("페이스북 호스트이름 / 호스트주소 : " + 페북);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//www.instagram.com 인스타그램 호스트이름 호스트주소
		try {
			InetAddress 인스타 = InetAddress.getByName("www.instagram.com");
			System.out.println("인스타그램 호스트이름 / 호스트주소 : " + 인스타);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
