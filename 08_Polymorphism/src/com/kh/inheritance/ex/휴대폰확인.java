package com.kh.inheritance.ex;

public class 휴대폰확인 {

	public static void main(String[] args) {
		
		//스마트폰 중에서 아이폰을 확인하기
		스마트폰 iphone = new 아이폰();
		//아이폰 iphone = new 아이폰();
		
		//스마트폰 그릇에 아이폰을 가지고 오면 
		//부모 클래스의 기능은 가져올 수 있지만 자식 클래스의 기능은 가져올 수 없음
		iphone.set화면("레티나 디스플레이");
		System.out.println("iphone의 화면은 " + iphone.get화면());
		
		iphone.set통신사("kh");
		System.out.println("iphone의 통신사는 " + iphone.get통신사());
		
		iphone.set성능("최신");
		System.out.println("iphone의 성능은 "  + iphone.get성능());
		
		//부모 클래스의 기능을 상속받은 자식 클래스를 호출하면 모두 사용가능
		아이폰 ip2 = new 아이폰();
		
		ip2.set화면("사과화면");
		ip2.set통신사("kh");
		ip2.set성능("초고속");
		ip2.setIOS(1);
		System.out.println(ip2.toString());
		
		갤럭시 gal = new 갤럭시();
		
		gal.set화면("아몰레드");
		gal.set통신사("kh");
		gal.set성능("최신");
		gal.setAndroid(8);
		System.out.println(gal.toString());
		
		스마트폰 gal2 = new 갤럭시();
		
		gal2.set화면("아몰레드");
		gal2.set통신사("kh");
		gal2.set성능("최신초고속");
		//갤럭시에 있는 gal2.android를 가지고 오고싶다면
		//다운 캐스팅 - 강제 형변환을 해준 후에 불러올 수 있도록 해줌
		갤럭시 gal3 = (갤럭시) gal2;
		gal3.setAndroid(8);  // gal2를 gal3에 담아서 쓸 수 있도록 해줌
		System.out.println(gal3.toString());
	}
}
